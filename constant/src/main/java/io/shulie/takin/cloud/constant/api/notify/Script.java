package io.shulie.takin.cloud.constant.api.notify;

import cn.hutool.core.text.StrPool;
import cn.hutool.core.text.CharSequenceUtil;

/**
 * 脚本
 *
 * @author <a href="mailto:472546172@qq.com">张天赐</a>
 */
public class Script {
    private final String prefix;

    public Script(String prefix) {
        this.prefix = prefix;
    }

    private String getModule() {return CharSequenceUtil.join(StrPool.SLASH, prefix, "job", "script");}

    /**
     * 上报校验结果
     */
    public String verificationReport() {
        return CharSequenceUtil.addPrefixIfNot(
            CharSequenceUtil.join(StrPool.SLASH, this.getModule(), "verification", "report"), StrPool.SLASH);
    }
}
