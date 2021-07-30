package inter;

import bean.Config;

public interface SevableProcess extends Process {
    public default void process(){
        processLogic();
        Config.save();
    }


}
