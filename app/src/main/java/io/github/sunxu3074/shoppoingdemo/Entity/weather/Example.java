package io.github.sunxu3074.shoppoingdemo.Entity.weather;
/**
 * Awesome Pojo Generator
 * */
public class Example{
  private Integer date;
  private WeatherData data;
  private CityInfo cityInfo;
  private String time;
  private String message;
  private Integer status;
  public void setDate(Integer date){
   this.date=date;
  }
  public Integer getDate(){
   return date;
  }
  public void setData(WeatherData data){
   this.data=data;
  }
  public WeatherData getData(){
   return data;
  }
  public void setCityInfo(CityInfo cityInfo){
   this.cityInfo=cityInfo;
  }
  public CityInfo getCityInfo(){
   return cityInfo;
  }
  public void setTime(String time){
   this.time=time;
  }
  public String getTime(){
   return time;
  }
  public void setMessage(String message){
   this.message=message;
  }
  public String getMessage(){
   return message;
  }
  public void setStatus(Integer status){
   this.status=status;
  }
  public Integer getStatus(){
   return status;
  }
}