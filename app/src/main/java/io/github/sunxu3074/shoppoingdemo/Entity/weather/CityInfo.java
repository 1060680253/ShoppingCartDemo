package io.github.sunxu3074.shoppoingdemo.Entity.weather;
/**
 * Awesome Pojo Generator
 * */
public class CityInfo{
  private String parent;
  private String city;
  private String updateTime;
  private Integer cityId;
  public void setParent(String parent){
   this.parent=parent;
  }
  public String getParent(){
   return parent;
  }
  public void setCity(String city){
   this.city=city;
  }
  public String getCity(){
   return city;
  }
  public void setUpdateTime(String updateTime){
   this.updateTime=updateTime;
  }
  public String getUpdateTime(){
   return updateTime;
  }
  public void setCityId(Integer cityId){
   this.cityId=cityId;
  }
  public Integer getCityId(){
   return cityId;
  }
}