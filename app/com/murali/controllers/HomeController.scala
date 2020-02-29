package com.murali.controllers

import com.murali.views.html._
import controllers.AssetsFinder
import play.api.mvc._
import javax.inject._


@Singleton
class HomeController  @Inject()(cc: ControllerComponents)(implicit assetsFinder: AssetsFinder) extends AbstractController(cc){

  def home = Action {implicit request =>

    Ok(index("", assetsFinder))

  }







}
