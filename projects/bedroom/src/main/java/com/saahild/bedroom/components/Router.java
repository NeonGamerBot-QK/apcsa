package com.saahild.bedroom.components;

import com.saahild.bedroom.util.RouterStatus;

public class Router {

  private Boolean isOn;
  private RouterStatus status;
/**
 * Router class constructor
 */
  public Router() {
    isOn = false;
    status = RouterStatus.POWERED_OFF;
  }
/**
 * Router class constructor
 * @param pon set router status to on or off  
 */
  public Router(Boolean pon) {
    isOn = pon;
    if (pon) {
      status = RouterStatus.POWERED_ON;
    } else {
      status = RouterStatus.POWERED_OFF;
    }
  }
/**
 * turn on router
 */
  public void turnOn() {
    isOn = true;
    setRouterStatus(RouterStatus.POWERED_ON);
  }
/**
 * turn off router
 */
  public void turnOff() {
    isOn = false;
    setRouterStatus(RouterStatus.POWERED_OFF);
  }
/**
 * set router status
 * @param pstatus status to set for the router.
 */
  private void setRouterStatus(RouterStatus pstatus) {
    status = pstatus;
  }
/**
 * get router status
 * @return
 */
  public RouterStatus getStatus() {
    return status;
  }
/**
 * connect to internet
 */
  public void connectToInternet() {
    setRouterStatus(RouterStatus.CONNECTED);
  }
/**
 * disconenct from internet
 */
  public void disconnectFromInternet() {
    setRouterStatus(RouterStatus.DISCONNECTED);
  }
/**
 * is the router on
 * @return
 */
  public Boolean isOn() {
    return isOn;
  }
/**
 * is the router connected
 * @return
 */
  public Boolean isConnected() {
    return status == RouterStatus.CONNECTED;
  }
/**
 * is the router disconnected
 * @return
 */
  public Boolean isDisconnected() {
    return status == RouterStatus.DISCONNECTED;
  }
/**
 * is the router powered on
 * @return
 */
  public Boolean isPoweredOn() {
    return status == RouterStatus.POWERED_ON;
  }
/**
 * is the router powered off
 * @return
 */
  public Boolean isPoweredOff() {
    return status == RouterStatus.POWERED_OFF;
  }
  @Override
  public String toString() {
    return "Router {isOn=" + isOn + ", status=" + status + "}";
  }
}
