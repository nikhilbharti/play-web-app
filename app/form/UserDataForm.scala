package form

import java.time.LocalDate

import models.UserDataModel
import play.api.data.Form
import play.api.data.Forms._

object UserDataForm {
  val userDataForm = Form(
    mapping(
      "name" -> nonEmptyText,
      "gender" -> nonEmptyText,
      "age" -> nonEmptyText,
      "country" -> nonEmptyText
    )(UserDataModel.apply)(UserDataModel.unapply)
  )
}