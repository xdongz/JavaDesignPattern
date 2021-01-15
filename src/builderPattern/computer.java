/*
 * Copyright 2021 Synopsys Inc. All rights reserved.
 * This file is confidential material. Unauthorized distribution prohibited.
 */
package builderPattern;

/**
 * General product information.
 */
public class computer{
  private String cpu;
  private String gpu;
  private String memery;
  private String hd;

  public void setCpu(String cpu) {
    this.cpu = cpu;
  }

  public void setGpu(String gpu) {
    this.gpu = gpu;
  }

  public void setMemery(String memery) {
    this.memery = memery;
  }

  public void setHd(String hd) {
    this.hd = hd;
  }

  @Override
  public String toString() {
    return "Computer [cpu=" + cpu + ", gpu=" + gpu + ", memery=" + memery + ", hd=" + hd + "]";
  }
}
