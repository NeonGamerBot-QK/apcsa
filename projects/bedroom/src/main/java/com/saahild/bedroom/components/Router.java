package com.saahild.bedroom.components;

import com.saahild.bedroom.util.RouterStatus;

public class Router {

  private Boolean isOn;
  private RouterStatus status;

  public Router() {
    isOn = false;
    status = RouterStatus.POWERED_OFF;
  }

  public Router(Boolean pon) {
    isOn = pon;
    if (pon) {
      status = RouterStatus.POWERED_ON;
    } else {
      status = RouterStatus.POWERED_OFF;
    }
  }

  public void turnOn() {
    isOn = true;
    setRouterStatus(RouterStatus.POWERED_ON);
  }

  public void turnOff() {
    isOn = false;
    setRouterStatus(RouterStatus.POWERED_OFF);
  }

  private void setRouterStatus(RouterStatus pstatus) {
    status = pstatus;
  }

  public RouterStatus getStatus() {
    return status;
  }

  public void connectToInternet() {
    setRouterStatus(RouterStatus.CONNECTED);
  }

  public void disconnectFromInternet() {
    setRouterStatus(RouterStatus.DISCONNECTED);
  }

  public Boolean isOn() {
    return isOn;
  }

  public Boolean isConnected() {
    return status == RouterStatus.CONNECTED;
  }

  public Boolean isDisconnected() {
    return status == RouterStatus.DISCONNECTED;
  }

  public Boolean isPoweredOn() {
    return status == RouterStatus.POWERED_ON;
  }

  public Boolean isPoweredOff() {
    return status == RouterStatus.POWERED_OFF;
  }
}
