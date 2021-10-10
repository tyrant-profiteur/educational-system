package com.tyrant.educational.testcode.iocinit;

/**
 * @author:profiteur
 * @create 2021-09-12 22:35
 * @description
 **/
public class VipUser extends User {
    private int vipLev;

    public int getVipLev() {
        return vipLev;
    }

    public void setVipLev(int vipLev) {
        this.vipLev = vipLev;
    }

    @Override
    public String toString() {
        return "VipUser{" +
                "vipLev=" + vipLev +
                '}';
    }
}
