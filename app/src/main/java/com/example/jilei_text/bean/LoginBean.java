package com.example.jilei_text.bean;

public class LoginBean {

    /**
     * result : {"sessionId":"1535699520897308","userId":308,"userInfo":{"birthday":887644800000,"headPic":"http://172.17.8.100/images/movie/head_pic/2018-08-30/20180830201352.jpg","id":308,"lastLogStringime":1535699437000,"nickName":"老街旧人","phone":"18311256817","sex":1}}
     * message : 登陆成功
     * status : 0000
     */

    private ResultBean result;
    private String message;
    private String status;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class ResultBean {
        /**
         * sessionId : 1535699520897308
         * userId : 308
         * userInfo : {"birthday":887644800000,"headPic":"http://172.17.8.100/images/movie/head_pic/2018-08-30/20180830201352.jpg","id":308,"lastLogStringime":1535699437000,"nickName":"老街旧人","phone":"18311256817","sex":1}
         */

        private String sessionId;
        private String userId;
        private UserInfoBean userInfo;

        public String getSessionId() {
            return sessionId;
        }

        public void setSessionId(String sessionId) {
            this.sessionId = sessionId;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public UserInfoBean getUserInfo() {
            return userInfo;
        }

        public void setUserInfo(UserInfoBean userInfo) {
            this.userInfo = userInfo;
        }

        public static class UserInfoBean {
            /**
             * birthday : 887644800000
             * headPic : http://172.17.8.100/images/movie/head_pic/2018-08-30/20180830201352.jpg
             * id : 308
             * lastLogStringime : 1535699437000
             * nickName : 老街旧人
             * phone : 18311256817
             * sex : 1
             */

            private long birthday;
            private String headPic;
            private String id;
            private long lastLogStringime;
            private String nickName;
            private String phone;
            private String sex;

            public long getBirthday() {
                return birthday;
            }

            public void setBirthday(long birthday) {
                this.birthday = birthday;
            }

            public String getHeadPic() {
                return headPic;
            }

            public void setHeadPic(String headPic) {
                this.headPic = headPic;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public long getLastLogStringime() {
                return lastLogStringime;
            }

            public void setLastLogStringime(long lastLogStringime) {
                this.lastLogStringime = lastLogStringime;
            }

            public String getNickName() {
                return nickName;
            }

            public void setNickName(String nickName) {
                this.nickName = nickName;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getSex() {
                return sex;
            }

            public void setSex(String sex) {
                this.sex = sex;
            }
        }
    }
}
