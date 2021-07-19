import com.google.inject.AbstractModule
import net.codingwell.scalaguice.ScalaModule
import play.api.{Configuration, Environment}
import products.data.repositories.{ProductRepository, ProductRepositoryImpl}

import javax.inject._

/**
  * Sets up custom components for Play.
  *
  * https://www.playframework.com/documentation/latest/ScalaDependencyInjection
  */
class Module(environment: Environment, configuration: Configuration)
    extends AbstractModule
    with ScalaModule {

  override def configure() = {
    bind[ProductRepository].to[ProductRepositoryImpl].in[Singleton]()
  }
}
