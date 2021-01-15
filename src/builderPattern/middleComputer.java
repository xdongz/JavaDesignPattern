/*
 * Copyright 2021 Synopsys Inc. All rights reserved.
 * This file is confidential material. Unauthorized distribution prohibited.
 */
package builderPattern;

public class middleComputer implements computerBuilder{
  private computer c = new computer();

  @Override
  public void setCpu() {
    c.setCpu("中配cpu");
  }

  @Override
  public void setGpu() {
    c.setGpu("中配gpu");
  }

  @Override
  public void setMemery() {
    c.setMemery("中配memery");
  }

  @Override
  public void setHd() {
    c.setHd("中配Hd");
  }

  @Override
  public computer build() {
    return c;
  }

}
