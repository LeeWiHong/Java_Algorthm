package Hanoi;

/**
* @program: 汉诺塔算法实现
*
* @description:
*
* @author: LeeWiHong
*
* @create: 2019/3/13-17:29
**/

public class Hanoi {
    private int sum = 0;
    public void move(int nums,char disk1,char disk2){
        System.out.println("这是第"+(++this.sum)+"次移动"+"把"+nums+"号盘从"+disk1+"移动到"+disk2);
    }
    public void hanoimove(int n,char disk1,char disk2,char disk3){
        if (n == 1){
            this.move(1,disk1,disk3);
        }else {
            this.hanoimove(n-1,disk1,disk3,disk2);
            this.move(n,disk1,disk3);
            this.hanoimove(n-1,disk2,disk1,disk3);
        }
    }


}
