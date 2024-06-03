package handler

import (
	"github.com/gin-gonic/gin"
	"github.com/vhlebnikov/Data_Processing_and_Storage_Course/internal/app/model"
	"github.com/vhlebnikov/Data_Processing_and_Storage_Course/internal/app/myerr"
	"net/http"
	"time"
)

func (h *Handler) CreateBooking(c *gin.Context) {
	var request struct {
		BookDate      string `json:"bookDate" binding:"required"`
		PassengerName string `json:"passengerName" binding:"required"`
		ContactData   gin.H  `json:"contactData"`
		FareCondition string `json:"fareCondition" binding:"required"`
		FlightIds     []int  `json:"flightIds" binding:"required"`
	}

	if err := c.ShouldBindJSON(&request); err != nil {
		myerr.New(c, http.StatusBadRequest, err.Error())
		return
	}

	if request.FareCondition != "Economy" && request.FareCondition != "Comfort" &&
		request.FareCondition != "Business" {
		myerr.New(c, http.StatusBadRequest, "unknown 'fareCondition' value")
		return
	}

	bookDateTime, err := time.Parse(time.DateOnly, request.BookDate)
	if err != nil {
		myerr.New(c, http.StatusBadRequest, err.Error())
		return
	}

	booking, err := h.services.Create.CreateBooking(bookDateTime, request.PassengerName, request.FareCondition,
		request.FlightIds, model.JSON(request.ContactData))
	if err != nil {
		myerr.New(c, http.StatusInternalServerError, err.Error())
		return
	}

	c.JSON(http.StatusOK, model.Response{
		Message: "ok",
		Payload: booking,
	})

}

func (h *Handler) CheckIn(c *gin.Context) {

}
