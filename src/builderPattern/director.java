/*
 * Copyright 2021 Synopsys Inc. All rights reserved.
 * This file is confidential material. Unauthorized distribution prohibited.
 */
package builderPattern;

/**
 * 指挥者
 *
 * 该类用于调用具体的建造者，并实现建造产品的方法。
 *
 * 因为同一类的产品建造步骤是一样的，可以统一放在一个类中。
 */
public class director {

  private computerBuilder cb;

  public void setCb(computerBuilder cb) {
    this.cb = cb;
  }

  public void build() {
    cb.setCpu();
    cb.setGpu();
    cb.setMemery();
    cb.setHd();

  }
}
