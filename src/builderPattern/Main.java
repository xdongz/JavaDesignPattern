/*
 * Copyright 2021 Synopsys Inc. All rights reserved.
 * This file is confidential material. Unauthorized distribution prohibited.
 */
package builderPattern;

public class Main {

  public static void main(String[] args) {

    director dir = new director();

    //高配
    advancedComputer adc = new advancedComputer();
    dir.setCb(adc);
    dir.build();
    computer c1 = adc.build();
    System.out.println(c1);

    //中配
    middleComputer mic = new middleComputer();
    dir.setCb(mic);
    dir.build();
    computer c2 = mic.build();
    System.out.println(c2);

    //低配
    lowComputer loc = new lowComputer();
    dir.setCb(loc);
    dir.build();
    computer c3 = loc.build();
    System.out.println(c3);
  }


}
