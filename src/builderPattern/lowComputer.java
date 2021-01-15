/*
 * Copyright 2021 Synopsys Inc. All rights reserved.
 * This file is confidential material. Unauthorized distribution prohibited.
 */
package builderPattern;

public class lowComputer implements computerBuilder{
  private computer c = new computer();

  @Override
  public void setCpu() {
    c.setCpu("低配cpu");
  }

  @Override
  public void setGpu() {
    c.setGpu("低配gpu");
  }

  @Override
  public void setMemery() {
    c.setMemery("低配memery");
  }

  @Override
  public void setHd() {
    c.setHd("低配Hd");
  }

  @Override
  public computer build() {
    return c;
  }

}
