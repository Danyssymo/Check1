package uno.dos.tres.service;

import uno.dos.tres.bean.RegInfo;


public interface Validator {

    void checkRegInfo(RegInfo regInfo) throws ServiceException;

}
