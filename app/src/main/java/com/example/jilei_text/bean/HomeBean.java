package com.example.jilei_text.bean;

import java.util.List;

public class HomeBean {

    /**
     * code : 1
     * data : [{"id":"1410","catid":"1","catid2":"21","title":"VismantėTubelytė   -   淡雅到极致的设计美","type":"1","video_type":"","uid":"100295","lecturer":"无","sign_number":"0","purchase_number":"0","is_charge":"0","is_vip":"0","price":"0","label":"","logo":"https://app.tuozhe8.com/tuozheapp/thumb-artimages/20180815/b54d48a9f304741ae9949342d28ad58a.jpeg","like_number":"0","like_count":"8","comment_count":"0","view_count":"589","hot":"1","creatime":"1534233628","hot_time":"1534303244","is_del":"0","source":"1","nick_name":"","status":"1","drafts":"0","share_links":"https://app.tuozhe8.com/api.php/api8/share/details/id/1410.html","share_links_new":"https://app.tuozhe8.com/api.php/api8/share/details_new/id/1410.html","check":"1"},{"id":"1419","catid":"1","catid2":"21","title":"云行设计  -  沐光","type":"1","video_type":"","uid":"104852","lecturer":"无","sign_number":"0","purchase_number":"0","is_charge":"0","is_vip":"0","price":"0","label":"","logo":"https://app.tuozhe8.com/tuozheapp/thumb-artimages/20180815/75fb7b94a08b140be197d46d65692663.jpeg","like_number":"0","like_count":"6","comment_count":"0","view_count":"643","hot":"1","creatime":"1534239476","hot_time":"1534303238","is_del":"0","source":"1","nick_name":"","status":"1","drafts":"0","share_links":"https://app.tuozhe8.com/api.php/api8/share/details/id/1419.html","share_links_new":"https://app.tuozhe8.com/api.php/api8/share/details_new/id/1419.html","check":"2"},{"id":"1412","catid":"2","catid2":"24","title":"冷元宝设计  -  雅与静并蓄，风雅徐来！","type":"1","video_type":"","uid":"100295","lecturer":"无","sign_number":"0","purchase_number":"0","is_charge":"0","is_vip":"0","price":"0","label":"","logo":"https://app.tuozhe8.com/tuozheapp/thumb-artimages/20180815/8c6ed25d2fbf3780b18d895b24a9b2d1.jpeg","like_number":"0","like_count":"7","comment_count":"0","view_count":"666","hot":"1","creatime":"1534234128","hot_time":"1534303230","is_del":"0","source":"1","nick_name":"","status":"1","drafts":"0","share_links":"https://app.tuozhe8.com/api.php/api8/share/details/id/1412.html","share_links_new":"https://app.tuozhe8.com/api.php/api8/share/details_new/id/1412.html","check":"1"},{"id":"1420","catid":"1","catid2":"21","title":"云行设计新作  -  静谧·行光","type":"1","video_type":"","uid":"104852","lecturer":"无","sign_number":"0","purchase_number":"0","is_charge":"0","is_vip":"0","price":"0","label":"","logo":"https://app.tuozhe8.com/tuozheapp/thumb-artimages/20180815/e5acb124cf34ae391068d716166492d9.jpeg","like_number":"0","like_count":"4","comment_count":"0","view_count":"419","hot":"1","creatime":"1534240062","hot_time":"1534303224","is_del":"0","source":"1","nick_name":"","status":"1","drafts":"0","share_links":"https://app.tuozhe8.com/api.php/api8/share/details/id/1420.html","share_links_new":"https://app.tuozhe8.com/api.php/api8/share/details_new/id/1420.html","check":"2"},{"id":"1405","catid":"7","catid2":"21","title":"OLIIII CHINA办公空间  -  杭州","type":"1","video_type":"","uid":"100295","lecturer":"无","sign_number":"0","purchase_number":"0","is_charge":"0","is_vip":"0","price":"0","label":"","logo":"https://app.tuozhe8.com/tuozheapp/thumb-artimages/20180815/f6733e0e078a067be6a71d00a8a4cd9d.jpeg","like_number":"0","like_count":"5","comment_count":"0","view_count":"437","hot":"1","creatime":"1534219410","hot_time":"1534303212","is_del":"0","source":"1","nick_name":"","status":"1","drafts":"0","share_links":"https://app.tuozhe8.com/api.php/api8/share/details/id/1405.html","share_links_new":"https://app.tuozhe8.com/api.php/api8/share/details_new/id/1405.html","check":"1"},{"id":"1401","catid":"8","catid2":"21","title":"Shine Moda旗舰店  -  西涛设计工作室","type":"1","video_type":"","uid":"100295","lecturer":"无","sign_number":"0","purchase_number":"0","is_charge":"0","is_vip":"0","price":"0","label":"","logo":"https://app.tuozhe8.com/tuozheapp/thumb-artimages/20180815/5604132c4105dfd3699f65967b33d912.jpeg","like_number":"0","like_count":"0","comment_count":"0","view_count":"300","hot":"1","creatime":"1534215605","hot_time":"1534303209","is_del":"0","source":"1","nick_name":"","status":"1","drafts":"0","share_links":"https://app.tuozhe8.com/api.php/api8/share/details/id/1401.html","share_links_new":"https://app.tuozhe8.com/api.php/api8/share/details_new/id/1401.html","check":"1"}]
     * message : success
     */

    private String code;
    private String message;
    private List<DataBean> data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 1410
         * catid : 1
         * catid2 : 21
         * title : VismantėTubelytė   -   淡雅到极致的设计美
         * type : 1
         * video_type :
         * uid : 100295
         * lecturer : 无
         * sign_number : 0
         * purchase_number : 0
         * is_charge : 0
         * is_vip : 0
         * price : 0
         * label :
         * logo : https://app.tuozhe8.com/tuozheapp/thumb-artimages/20180815/b54d48a9f304741ae9949342d28ad58a.jpeg
         * like_number : 0
         * like_count : 8
         * comment_count : 0
         * view_count : 589
         * hot : 1
         * creatime : 1534233628
         * hot_time : 1534303244
         * is_del : 0
         * source : 1
         * nick_name :
         * status : 1
         * drafts : 0
         * share_links : https://app.tuozhe8.com/api.php/api8/share/details/id/1410.html
         * share_links_new : https://app.tuozhe8.com/api.php/api8/share/details_new/id/1410.html
         * check : 1
         */

        private String id;
        private String catid;
        private String catid2;
        private String title;
        private String type;
        private String video_type;
        private String uid;
        private String lecturer;
        private String sign_number;
        private String purchase_number;
        private String is_charge;
        private String is_vip;
        private String price;
        private String label;
        private String logo;
        private String like_number;
        private String like_count;
        private String comment_count;
        private String view_count;
        private String hot;
        private String creatime;
        private String hot_time;
        private String is_del;
        private String source;
        private String nick_name;
        private String status;
        private String drafts;
        private String share_links;
        private String share_links_new;
        private String check;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCatid() {
            return catid;
        }

        public void setCatid(String catid) {
            this.catid = catid;
        }

        public String getCatid2() {
            return catid2;
        }

        public void setCatid2(String catid2) {
            this.catid2 = catid2;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getVideo_type() {
            return video_type;
        }

        public void setVideo_type(String video_type) {
            this.video_type = video_type;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getLecturer() {
            return lecturer;
        }

        public void setLecturer(String lecturer) {
            this.lecturer = lecturer;
        }

        public String getSign_number() {
            return sign_number;
        }

        public void setSign_number(String sign_number) {
            this.sign_number = sign_number;
        }

        public String getPurchase_number() {
            return purchase_number;
        }

        public void setPurchase_number(String purchase_number) {
            this.purchase_number = purchase_number;
        }

        public String getIs_charge() {
            return is_charge;
        }

        public void setIs_charge(String is_charge) {
            this.is_charge = is_charge;
        }

        public String getIs_vip() {
            return is_vip;
        }

        public void setIs_vip(String is_vip) {
            this.is_vip = is_vip;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getLabel() {
            return label;
        }

        public void setLabel(String label) {
            this.label = label;
        }

        public String getLogo() {
            return logo;
        }

        public void setLogo(String logo) {
            this.logo = logo;
        }

        public String getLike_number() {
            return like_number;
        }

        public void setLike_number(String like_number) {
            this.like_number = like_number;
        }

        public String getLike_count() {
            return like_count;
        }

        public void setLike_count(String like_count) {
            this.like_count = like_count;
        }

        public String getComment_count() {
            return comment_count;
        }

        public void setComment_count(String comment_count) {
            this.comment_count = comment_count;
        }

        public String getView_count() {
            return view_count;
        }

        public void setView_count(String view_count) {
            this.view_count = view_count;
        }

        public String getHot() {
            return hot;
        }

        public void setHot(String hot) {
            this.hot = hot;
        }

        public String getCreatime() {
            return creatime;
        }

        public void setCreatime(String creatime) {
            this.creatime = creatime;
        }

        public String getHot_time() {
            return hot_time;
        }

        public void setHot_time(String hot_time) {
            this.hot_time = hot_time;
        }

        public String getIs_del() {
            return is_del;
        }

        public void setIs_del(String is_del) {
            this.is_del = is_del;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getNick_name() {
            return nick_name;
        }

        public void setNick_name(String nick_name) {
            this.nick_name = nick_name;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getDrafts() {
            return drafts;
        }

        public void setDrafts(String drafts) {
            this.drafts = drafts;
        }

        public String getShare_links() {
            return share_links;
        }

        public void setShare_links(String share_links) {
            this.share_links = share_links;
        }

        public String getShare_links_new() {
            return share_links_new;
        }

        public void setShare_links_new(String share_links_new) {
            this.share_links_new = share_links_new;
        }

        public String getCheck() {
            return check;
        }

        public void setCheck(String check) {
            this.check = check;
        }
    }
}
