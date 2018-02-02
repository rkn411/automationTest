package com.tekion.selenium.common.enums;

import com.tekion.selenium.common.enums.WdprUrl;

/**
 * An interface for all Tekion' URLs.
 * 
 * @author rkothapalli@tekion.com
 */
public interface WdprUrl {
    
    public String getUrl();

    public boolean equalTo(WdprUrl url);
    
    public boolean equalTo(String url);

    public boolean contains(String url);

    public boolean isValid();
}
