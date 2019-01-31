package io.github.sunxu3074.shoppoingdemo.Entity.weather;
import java.util.List;
/**
 * Awesome Pojo Generator
 * */
public class WeatherData {
  private String shidu;
  private Yesterday yesterday;
  private Integer pm25;
  private Integer pm10;
  private String ganmao;
  private List<Forecast> forecast;
  private Integer wendu;
  private String quality;
  public void setShidu(String shidu){
   this.shidu=shidu;
  }
  public String getShidu(){
   return shidu;
  }
  public void setYesterday(Yesterday yesterday){
   this.yesterday=yesterday;
  }
  public Yesterday getYesterday(){
   return yesterday;
  }
  public void setPm25(Integer pm25){
   this.pm25=pm25;
  }
  public Integer getPm25(){
   return pm25;
  }
  public void setPm10(Integer pm10){
   this.pm10=pm10;
  }
  public Integer getPm10(){
   return pm10;
  }
  public void setGanmao(String ganmao){
   this.ganmao=ganmao;
  }
  public String getGanmao(){
   return ganmao;
  }
  public void setForecast(List<Forecast> forecast){
   this.forecast=forecast;
  }
  public List<Forecast> getForecast(){
   return forecast;
  }
  public void setWendu(Integer wendu){
   this.wendu=wendu;
  }
  public Integer getWendu(){
   return wendu;
  }
  public void setQuality(String quality){
   this.quality=quality;
  }
  public String getQuality(){
   return quality;
  }
}