package bean.inter;

import bean.FromBean;
import bean.ToBean;

public interface MethodCallBack {

    String getMethodName();

    ToBean callMethod(FromBean frombean) throws Exception;
}
