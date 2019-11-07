/**
 * @author qiyu.ran
 * @date 2019/11/7 13:57
 */
public class Speaker {
    public void speak(){
        System.out.println("speak");
    }

    /**
     * 增加方法
     */
    public void tell(){
        System.out.println("增加方法");
    }

    public void listen(){
        System.out.println("listen");
    }

    public void read(){
        System.out.println("read，这时有修改");
        System.out.println("增加逻辑");
    }
}
