package builderPattern;/*
 * Copyright 2021 Synopsys Inc. All rights reserved.
 * This file is confidential material. Unauthorized distribution prohibited.
 */

/**
 * 抽象建造者
 *
 * 固定产品的建造步骤.
 * 也就是说实现一个通用的产品必须要设置的属性。
 * 还需包含一个返回产品的方法。
 */
public interface computerBuilder {

  public void setCpu();
  public void setGpu();
  public void setMemery();
  public void setHd();
  public computer build();

}
