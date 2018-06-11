package zz.mvpone.com.mvpshili.Modler.bean;

/**
 * Created by Administrator on 2018-03-12.
 */

public class PasswordBean {

    /**
     * data : {"token":"28517FFA1CED8FFC171C3AFB4430D9AC877016D64ECA71757EB8A336BC35B006","uuid":"a925d3a20b954c3a986f0305b4366766"}
     * errmsg : success
     * errcode : 200
     */

    private DataBean data;
    private String errmsg;
    private String errcode;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public String getErrcode() {
        return errcode;
    }

    public void setErrcode(String errcode) {
        this.errcode = errcode;
    }

    public static class DataBean {
        /**
         * token : 28517FFA1CED8FFC171C3AFB4430D9AC877016D64ECA71757EB8A336BC35B006
         * uuid : a925d3a20b954c3a986f0305b4366766
         */

        private String token;
        private String uuid;

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getUuid() {
            return uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "token='" + token + '\'' +
                    ", uuid='" + uuid + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "PasswordBean{" +
                "data=" + data +
                ", errmsg='" + errmsg + '\'' +
                ", errcode='" + errcode + '\'' +
                '}';
    }
}
