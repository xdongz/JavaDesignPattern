/*
 * Copyright 2021 Synopsys Inc. All rights reserved.
 * This file is confidential material. Unauthorized distribution prohibited.
 */
package builderPattern;

/**
 * Concrete product information.
 *
 * 实现抽象建造者
 */
public class advancedComputer implements computerBuilder{
  private computer c = new computer();

  @Override
  public void setCpu() { c.setCpu("高配cpu");
  }

  @Override
  public void setGpu() {
    c.setGpu("高配gpu");
  }

  @Override
  public void setMemery() {
    c.setMemery("高配memery");
  }

  @Override
  public void setHd() {
    c.setHd("高配Hd");
  }

  @Override
  public computer build() {
    return c;
  }
}


