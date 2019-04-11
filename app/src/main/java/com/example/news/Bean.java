package com.example.news;

import java.util.List;

public class Bean {

    private int code;
    private String msg;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private List<TechBean> tech;
        private List<AutoBean> auto;
        private List<MoneyBean> money;
        private List<SportsBean> sports;
        private List<DyBean> dy;
        private List<WarBean> war;
        private List<EntBean> ent;
        private List<ToutiaoBean> toutiao;

        public List<TechBean> getTech() {
            return tech;
        }

        public void setTech(List<TechBean> tech) {
            this.tech = tech;
        }

        public List<AutoBean> getAuto() {
            return auto;
        }

        public void setAuto(List<AutoBean> auto) {
            this.auto = auto;
        }

        public List<MoneyBean> getMoney() {
            return money;
        }

        public void setMoney(List<MoneyBean> money) {
            this.money = money;
        }

        public List<SportsBean> getSports() {
            return sports;
        }

        public void setSports(List<SportsBean> sports) {
            this.sports = sports;
        }

        public List<DyBean> getDy() {
            return dy;
        }

        public void setDy(List<DyBean> dy) {
            this.dy = dy;
        }

        public List<WarBean> getWar() {
            return war;
        }

        public void setWar(List<WarBean> war) {
            this.war = war;
        }

        public List<EntBean> getEnt() {
            return ent;
        }

        public void setEnt(List<EntBean> ent) {
            this.ent = ent;
        }

        public List<ToutiaoBean> getToutiao() {
            return toutiao;
        }

        public void setToutiao(List<ToutiaoBean> toutiao) {
            this.toutiao = toutiao;
        }

        public static class TechBean {
            /**
             * liveInfo : null
             * tcount : 264
             * picInfo : [{"ref":null,"width":null,"url":"http://cms-bucket.ws.126.net/2019/04/09/654bbd342729423b818709c9f15e5652.png","height":null}]
             * docid : ECAK0I2900097U7R
             * videoInfo : null
             * channel : tech
             * link : https://3g.163.com/all/article/ECAK0I2900097U7R.html
             * source : AI财经社
             * title : 小米去年扭亏为盈赚134亿元 雷军年薪超98亿元
             * type : doc
             * imgsrcFrom : null
             * imgsrc3gtype : 1
             * unlikeReason : 重复、旧闻/6,内容质量差/6
             * isTop : null
             * digest : 4月9日消息，据香港明报报道，小米集团于4月8日公布了上市后
             * typeid :
             * addata : null
             * tag :
             * category : 科技
             * ptime : 2019-04-09 10:42:53
             */

            private Object liveInfo;
            private int tcount;
            private String docid;
            private Object videoInfo;
            private String channel;
            private String link;
            private String source;
            private String title;
            private String type;
            private Object imgsrcFrom;
            private int imgsrc3gtype;
            private String unlikeReason;
            private Object isTop;
            private String digest;
            private String typeid;
            private Object addata;
            private String tag;
            private String category;
            private String ptime;
            private List<PicInfoBean> picInfo;

            public Object getLiveInfo() {
                return liveInfo;
            }

            public void setLiveInfo(Object liveInfo) {
                this.liveInfo = liveInfo;
            }

            public int getTcount() {
                return tcount;
            }

            public void setTcount(int tcount) {
                this.tcount = tcount;
            }

            public String getDocid() {
                return docid;
            }

            public void setDocid(String docid) {
                this.docid = docid;
            }

            public Object getVideoInfo() {
                return videoInfo;
            }

            public void setVideoInfo(Object videoInfo) {
                this.videoInfo = videoInfo;
            }

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
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

            public Object getImgsrcFrom() {
                return imgsrcFrom;
            }

            public void setImgsrcFrom(Object imgsrcFrom) {
                this.imgsrcFrom = imgsrcFrom;
            }

            public int getImgsrc3gtype() {
                return imgsrc3gtype;
            }

            public void setImgsrc3gtype(int imgsrc3gtype) {
                this.imgsrc3gtype = imgsrc3gtype;
            }

            public String getUnlikeReason() {
                return unlikeReason;
            }

            public void setUnlikeReason(String unlikeReason) {
                this.unlikeReason = unlikeReason;
            }

            public Object getIsTop() {
                return isTop;
            }

            public void setIsTop(Object isTop) {
                this.isTop = isTop;
            }

            public String getDigest() {
                return digest;
            }

            public void setDigest(String digest) {
                this.digest = digest;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public Object getAddata() {
                return addata;
            }

            public void setAddata(Object addata) {
                this.addata = addata;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getPtime() {
                return ptime;
            }

            public void setPtime(String ptime) {
                this.ptime = ptime;
            }

            public List<PicInfoBean> getPicInfo() {
                return picInfo;
            }

            public void setPicInfo(List<PicInfoBean> picInfo) {
                this.picInfo = picInfo;
            }

            public static class PicInfoBean {
                /**
                 * ref : null
                 * width : null
                 * url : http://cms-bucket.ws.126.net/2019/04/09/654bbd342729423b818709c9f15e5652.png
                 * height : null
                 */

                private Object ref;
                private Object width;
                private String url;
                private Object height;

                public Object getRef() {
                    return ref;
                }

                public void setRef(Object ref) {
                    this.ref = ref;
                }

                public Object getWidth() {
                    return width;
                }

                public void setWidth(Object width) {
                    this.width = width;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public Object getHeight() {
                    return height;
                }

                public void setHeight(Object height) {
                    this.height = height;
                }
            }
        }

        public static class AutoBean {
            /**
             * liveInfo : null
             * tcount : 512
             * picInfo : [{"ref":null,"width":null,"url":"http://cms-bucket.ws.126.net/2019/04/09/3be8ecac9190467792271a999488140e.jpeg","height":null}]
             * docid : EC9FUAFR0008856R
             * videoInfo : null
             * channel : auto
             * link : https://3g.163.com/all/article/EC9FUAFR0008856R.html
             * source : 网易汽车
             * title : "小GLC"全球首发 奔驰上海车展阵容豪华
             * type : doc
             * imgsrcFrom : null
             * imgsrc3gtype : 1
             * unlikeReason : 重复、旧闻/6,内容质量差/6
             * isTop : null
             * digest : 梅赛德斯-奔驰将在上海车展上带来十余款首发车型，覆盖各个细分
             * typeid :
             * addata : null
             * tag :
             * category : 汽车
             * ptime : 2019-04-09 00:12:31
             */

            private Object liveInfo;
            private int tcount;
            private String docid;
            private Object videoInfo;
            private String channel;
            private String link;
            private String source;
            private String title;
            private String type;
            private Object imgsrcFrom;
            private int imgsrc3gtype;
            private String unlikeReason;
            private Object isTop;
            private String digest;
            private String typeid;
            private Object addata;
            private String tag;
            private String category;
            private String ptime;
            private List<PicInfoBeanX> picInfo;

            public Object getLiveInfo() {
                return liveInfo;
            }

            public void setLiveInfo(Object liveInfo) {
                this.liveInfo = liveInfo;
            }

            public int getTcount() {
                return tcount;
            }

            public void setTcount(int tcount) {
                this.tcount = tcount;
            }

            public String getDocid() {
                return docid;
            }

            public void setDocid(String docid) {
                this.docid = docid;
            }

            public Object getVideoInfo() {
                return videoInfo;
            }

            public void setVideoInfo(Object videoInfo) {
                this.videoInfo = videoInfo;
            }

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
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

            public Object getImgsrcFrom() {
                return imgsrcFrom;
            }

            public void setImgsrcFrom(Object imgsrcFrom) {
                this.imgsrcFrom = imgsrcFrom;
            }

            public int getImgsrc3gtype() {
                return imgsrc3gtype;
            }

            public void setImgsrc3gtype(int imgsrc3gtype) {
                this.imgsrc3gtype = imgsrc3gtype;
            }

            public String getUnlikeReason() {
                return unlikeReason;
            }

            public void setUnlikeReason(String unlikeReason) {
                this.unlikeReason = unlikeReason;
            }

            public Object getIsTop() {
                return isTop;
            }

            public void setIsTop(Object isTop) {
                this.isTop = isTop;
            }

            public String getDigest() {
                return digest;
            }

            public void setDigest(String digest) {
                this.digest = digest;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public Object getAddata() {
                return addata;
            }

            public void setAddata(Object addata) {
                this.addata = addata;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getPtime() {
                return ptime;
            }

            public void setPtime(String ptime) {
                this.ptime = ptime;
            }

            public List<PicInfoBeanX> getPicInfo() {
                return picInfo;
            }

            public void setPicInfo(List<PicInfoBeanX> picInfo) {
                this.picInfo = picInfo;
            }

            public static class PicInfoBeanX {
                /**
                 * ref : null
                 * width : null
                 * url : http://cms-bucket.ws.126.net/2019/04/09/3be8ecac9190467792271a999488140e.jpeg
                 * height : null
                 */

                private Object ref;
                private Object width;
                private String url;
                private Object height;

                public Object getRef() {
                    return ref;
                }

                public void setRef(Object ref) {
                    this.ref = ref;
                }

                public Object getWidth() {
                    return width;
                }

                public void setWidth(Object width) {
                    this.width = width;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public Object getHeight() {
                    return height;
                }

                public void setHeight(Object height) {
                    this.height = height;
                }
            }
        }

        public static class MoneyBean {
            /**
             * liveInfo : null
             * tcount : 84
             * picInfo : [{"ref":null,"width":null,"url":"http://cms-bucket.ws.126.net/2019/04/09/a58aecac082e472399c2117144ce448f.jpeg","height":null}]
             * docid : ECAKVOQB00259ARN
             * videoInfo : null
             * channel : money
             * link : https://3g.163.com/all/article/ECAKVOQB00259ARN.html
             * source : 网易号外
             * title : 号外|乐视网:不存在融创掏空乐视网情况
             * type : doc
             * imgsrcFrom : null
             * imgsrc3gtype : 1
             * unlikeReason : 重复、旧闻/6,内容质量差/6
             * isTop : null
             * digest : 网易财经4月9日讯今日上午乐视网（300104）股东大会召开
             * typeid :
             * addata : null
             * tag :
             * category : 财经
             * ptime : 2019-04-09 10:59:56
             */

            private Object liveInfo;
            private int tcount;
            private String docid;
            private Object videoInfo;
            private String channel;
            private String link;
            private String source;
            private String title;
            private String type;
            private Object imgsrcFrom;
            private int imgsrc3gtype;
            private String unlikeReason;
            private Object isTop;
            private String digest;
            private String typeid;
            private Object addata;
            private String tag;
            private String category;
            private String ptime;
            private List<PicInfoBeanXX> picInfo;

            public Object getLiveInfo() {
                return liveInfo;
            }

            public void setLiveInfo(Object liveInfo) {
                this.liveInfo = liveInfo;
            }

            public int getTcount() {
                return tcount;
            }

            public void setTcount(int tcount) {
                this.tcount = tcount;
            }

            public String getDocid() {
                return docid;
            }

            public void setDocid(String docid) {
                this.docid = docid;
            }

            public Object getVideoInfo() {
                return videoInfo;
            }

            public void setVideoInfo(Object videoInfo) {
                this.videoInfo = videoInfo;
            }

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
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

            public Object getImgsrcFrom() {
                return imgsrcFrom;
            }

            public void setImgsrcFrom(Object imgsrcFrom) {
                this.imgsrcFrom = imgsrcFrom;
            }

            public int getImgsrc3gtype() {
                return imgsrc3gtype;
            }

            public void setImgsrc3gtype(int imgsrc3gtype) {
                this.imgsrc3gtype = imgsrc3gtype;
            }

            public String getUnlikeReason() {
                return unlikeReason;
            }

            public void setUnlikeReason(String unlikeReason) {
                this.unlikeReason = unlikeReason;
            }

            public Object getIsTop() {
                return isTop;
            }

            public void setIsTop(Object isTop) {
                this.isTop = isTop;
            }

            public String getDigest() {
                return digest;
            }

            public void setDigest(String digest) {
                this.digest = digest;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public Object getAddata() {
                return addata;
            }

            public void setAddata(Object addata) {
                this.addata = addata;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getPtime() {
                return ptime;
            }

            public void setPtime(String ptime) {
                this.ptime = ptime;
            }

            public List<PicInfoBeanXX> getPicInfo() {
                return picInfo;
            }

            public void setPicInfo(List<PicInfoBeanXX> picInfo) {
                this.picInfo = picInfo;
            }

            public static class PicInfoBeanXX {
                /**
                 * ref : null
                 * width : null
                 * url : http://cms-bucket.ws.126.net/2019/04/09/a58aecac082e472399c2117144ce448f.jpeg
                 * height : null
                 */

                private Object ref;
                private Object width;
                private String url;
                private Object height;

                public Object getRef() {
                    return ref;
                }

                public void setRef(Object ref) {
                    this.ref = ref;
                }

                public Object getWidth() {
                    return width;
                }

                public void setWidth(Object width) {
                    this.width = width;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public Object getHeight() {
                    return height;
                }

                public void setHeight(Object height) {
                    this.height = height;
                }
            }
        }

        public static class SportsBean {
            /**
             * liveInfo : null
             * tcount : 97
             * picInfo : [{"ref":null,"width":null,"url":"http://cms-bucket.ws.126.net/2019/04/09/d27384899e1a485694120a86d9f60a01.jpeg","height":null},{"ref":null,"width":null,"url":"http://cms-bucket.ws.126.net/2019/04/09/f6aec20968774ba5a94c3409789d3620.jpeg","height":null},{"ref":null,"width":null,"url":"http://cms-bucket.ws.126.net/2019/04/09/bee4bdd4325748008a3addc07f3d028e.jpeg","height":null}]
             * docid : ECAI1V8Nbjlilin1
             * videoInfo : null
             * channel : sports
             * link : https://3g.163.com/all/photoview/0005/165399.html
             * source : 视觉中国
             * title : 热血青春!疯狂缠斗!NCAA新王诞生
             * type : photoset
             * imgsrcFrom : null
             * imgsrc3gtype : 2
             * unlikeReason : 重复、旧闻/6,内容质量差/6
             * isTop : null
             * digest :
             * typeid : 4TM10005|165399
             * addata : null
             * tag : 图集
             * category : 推荐
             * ptime : 2019-04-09 10:08:42
             */

            private Object liveInfo;
            private int tcount;
            private String docid;
            private Object videoInfo;
            private String channel;
            private String link;
            private String source;
            private String title;
            private String type;
            private Object imgsrcFrom;
            private int imgsrc3gtype;
            private String unlikeReason;
            private Object isTop;
            private String digest;
            private String typeid;
            private Object addata;
            private String tag;
            private String category;
            private String ptime;
            private List<PicInfoBeanXXX> picInfo;

            public Object getLiveInfo() {
                return liveInfo;
            }

            public void setLiveInfo(Object liveInfo) {
                this.liveInfo = liveInfo;
            }

            public int getTcount() {
                return tcount;
            }

            public void setTcount(int tcount) {
                this.tcount = tcount;
            }

            public String getDocid() {
                return docid;
            }

            public void setDocid(String docid) {
                this.docid = docid;
            }

            public Object getVideoInfo() {
                return videoInfo;
            }

            public void setVideoInfo(Object videoInfo) {
                this.videoInfo = videoInfo;
            }

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
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

            public Object getImgsrcFrom() {
                return imgsrcFrom;
            }

            public void setImgsrcFrom(Object imgsrcFrom) {
                this.imgsrcFrom = imgsrcFrom;
            }

            public int getImgsrc3gtype() {
                return imgsrc3gtype;
            }

            public void setImgsrc3gtype(int imgsrc3gtype) {
                this.imgsrc3gtype = imgsrc3gtype;
            }

            public String getUnlikeReason() {
                return unlikeReason;
            }

            public void setUnlikeReason(String unlikeReason) {
                this.unlikeReason = unlikeReason;
            }

            public Object getIsTop() {
                return isTop;
            }

            public void setIsTop(Object isTop) {
                this.isTop = isTop;
            }

            public String getDigest() {
                return digest;
            }

            public void setDigest(String digest) {
                this.digest = digest;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public Object getAddata() {
                return addata;
            }

            public void setAddata(Object addata) {
                this.addata = addata;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getPtime() {
                return ptime;
            }

            public void setPtime(String ptime) {
                this.ptime = ptime;
            }

            public List<PicInfoBeanXXX> getPicInfo() {
                return picInfo;
            }

            public void setPicInfo(List<PicInfoBeanXXX> picInfo) {
                this.picInfo = picInfo;
            }

            public static class PicInfoBeanXXX {
                /**
                 * ref : null
                 * width : null
                 * url : http://cms-bucket.ws.126.net/2019/04/09/d27384899e1a485694120a86d9f60a01.jpeg
                 * height : null
                 */

                private Object ref;
                private Object width;
                private String url;
                private Object height;

                public Object getRef() {
                    return ref;
                }

                public void setRef(Object ref) {
                    this.ref = ref;
                }

                public Object getWidth() {
                    return width;
                }

                public void setWidth(Object width) {
                    this.width = width;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public Object getHeight() {
                    return height;
                }

                public void setHeight(Object height) {
                    this.height = height;
                }
            }
        }

        public static class DyBean {
            /**
             * liveInfo : null
             * tcount : 51
             * picInfo : [{"ref":null,"width":null,"url":"http://cms-bucket.ws.126.net/2019/04/09/3273de759c1b4f24864fe2a2d7621a5b.png","height":null},{"ref":null,"width":null,"url":"http://cms-bucket.ws.126.net/2019/04/09/fadc14cdec034e7bb84ae3ece68f6beb.png","height":null},{"ref":null,"width":null,"url":"http://cms-bucket.ws.126.net/2019/04/09/f4bc39baa662469796112b611bd92a45.png","height":null}]
             * docid : ECAF0OLO0519830E
             * videoInfo : null
             * channel : dy
             * link : https://3g.163.com/all/article/ECAF0OLO0519830E.html
             * source : 餐饮老板内参
             * title : 啤酒配枸杞、火锅配消食片，餐厅如何抓住90后“养生青年”？
             * type : doc
             * imgsrcFrom : null
             * imgsrc3gtype : 2
             * unlikeReason : 重复、旧闻/6,内容质量差/6
             * isTop : null
             * digest : 作为餐饮消费主力军，以90后为代表的当代新青年生活标配是这样
             * typeid :
             * addata : null
             * tag :
             * category : 推荐
             * ptime : 2019-04-09 09:21:51
             */

            private Object liveInfo;
            private int tcount;
            private String docid;
            private Object videoInfo;
            private String channel;
            private String link;
            private String source;
            private String title;
            private String type;
            private Object imgsrcFrom;
            private int imgsrc3gtype;
            private String unlikeReason;
            private Object isTop;
            private String digest;
            private String typeid;
            private Object addata;
            private String tag;
            private String category;
            private String ptime;
            private List<PicInfoBeanXXXX> picInfo;

            public Object getLiveInfo() {
                return liveInfo;
            }

            public void setLiveInfo(Object liveInfo) {
                this.liveInfo = liveInfo;
            }

            public int getTcount() {
                return tcount;
            }

            public void setTcount(int tcount) {
                this.tcount = tcount;
            }

            public String getDocid() {
                return docid;
            }

            public void setDocid(String docid) {
                this.docid = docid;
            }

            public Object getVideoInfo() {
                return videoInfo;
            }

            public void setVideoInfo(Object videoInfo) {
                this.videoInfo = videoInfo;
            }

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
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

            public Object getImgsrcFrom() {
                return imgsrcFrom;
            }

            public void setImgsrcFrom(Object imgsrcFrom) {
                this.imgsrcFrom = imgsrcFrom;
            }

            public int getImgsrc3gtype() {
                return imgsrc3gtype;
            }

            public void setImgsrc3gtype(int imgsrc3gtype) {
                this.imgsrc3gtype = imgsrc3gtype;
            }

            public String getUnlikeReason() {
                return unlikeReason;
            }

            public void setUnlikeReason(String unlikeReason) {
                this.unlikeReason = unlikeReason;
            }

            public Object getIsTop() {
                return isTop;
            }

            public void setIsTop(Object isTop) {
                this.isTop = isTop;
            }

            public String getDigest() {
                return digest;
            }

            public void setDigest(String digest) {
                this.digest = digest;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public Object getAddata() {
                return addata;
            }

            public void setAddata(Object addata) {
                this.addata = addata;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getPtime() {
                return ptime;
            }

            public void setPtime(String ptime) {
                this.ptime = ptime;
            }

            public List<PicInfoBeanXXXX> getPicInfo() {
                return picInfo;
            }

            public void setPicInfo(List<PicInfoBeanXXXX> picInfo) {
                this.picInfo = picInfo;
            }

            public static class PicInfoBeanXXXX {
                /**
                 * ref : null
                 * width : null
                 * url : http://cms-bucket.ws.126.net/2019/04/09/3273de759c1b4f24864fe2a2d7621a5b.png
                 * height : null
                 */

                private Object ref;
                private Object width;
                private String url;
                private Object height;

                public Object getRef() {
                    return ref;
                }

                public void setRef(Object ref) {
                    this.ref = ref;
                }

                public Object getWidth() {
                    return width;
                }

                public void setWidth(Object width) {
                    this.width = width;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public Object getHeight() {
                    return height;
                }

                public void setHeight(Object height) {
                    this.height = height;
                }
            }
        }

        public static class WarBean {
            /**
             * liveInfo : null
             * tcount : 666
             * picInfo : [{"ref":null,"width":null,"url":"http://cms-bucket.ws.126.net/2019/04/09/3fbfe22da29e4b31ab45a227cd5aee08.jpeg","height":null}]
             * docid : 0001set2300939
             * videoInfo : null
             * channel : war
             * link : https://3g.163.com/all/photoview/0001/2300939.html
             * source : 参考消息
             * title : 对峙最前线! 波兰战机巡航波罗的海
             * type : photoset
             * imgsrcFrom : null
             * imgsrc3gtype : 3
             * unlikeReason : 重复、旧闻/6,内容质量差/6
             * isTop : null
             * digest :
             * typeid : 4T8E0001|2300939
             * addata : null
             * tag : 图集
             * category : 推荐
             * ptime : 2019-04-09 10:01:50
             */

            private Object liveInfo;
            private int tcount;
            private String docid;
            private Object videoInfo;
            private String channel;
            private String link;
            private String source;
            private String title;
            private String type;
            private Object imgsrcFrom;
            private int imgsrc3gtype;
            private String unlikeReason;
            private Object isTop;
            private String digest;
            private String typeid;
            private Object addata;
            private String tag;
            private String category;
            private String ptime;
            private List<PicInfoBeanXXXXX> picInfo;

            public Object getLiveInfo() {
                return liveInfo;
            }

            public void setLiveInfo(Object liveInfo) {
                this.liveInfo = liveInfo;
            }

            public int getTcount() {
                return tcount;
            }

            public void setTcount(int tcount) {
                this.tcount = tcount;
            }

            public String getDocid() {
                return docid;
            }

            public void setDocid(String docid) {
                this.docid = docid;
            }

            public Object getVideoInfo() {
                return videoInfo;
            }

            public void setVideoInfo(Object videoInfo) {
                this.videoInfo = videoInfo;
            }

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
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

            public Object getImgsrcFrom() {
                return imgsrcFrom;
            }

            public void setImgsrcFrom(Object imgsrcFrom) {
                this.imgsrcFrom = imgsrcFrom;
            }

            public int getImgsrc3gtype() {
                return imgsrc3gtype;
            }

            public void setImgsrc3gtype(int imgsrc3gtype) {
                this.imgsrc3gtype = imgsrc3gtype;
            }

            public String getUnlikeReason() {
                return unlikeReason;
            }

            public void setUnlikeReason(String unlikeReason) {
                this.unlikeReason = unlikeReason;
            }

            public Object getIsTop() {
                return isTop;
            }

            public void setIsTop(Object isTop) {
                this.isTop = isTop;
            }

            public String getDigest() {
                return digest;
            }

            public void setDigest(String digest) {
                this.digest = digest;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public Object getAddata() {
                return addata;
            }

            public void setAddata(Object addata) {
                this.addata = addata;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getPtime() {
                return ptime;
            }

            public void setPtime(String ptime) {
                this.ptime = ptime;
            }

            public List<PicInfoBeanXXXXX> getPicInfo() {
                return picInfo;
            }

            public void setPicInfo(List<PicInfoBeanXXXXX> picInfo) {
                this.picInfo = picInfo;
            }

            public static class PicInfoBeanXXXXX {
                /**
                 * ref : null
                 * width : null
                 * url : http://cms-bucket.ws.126.net/2019/04/09/3fbfe22da29e4b31ab45a227cd5aee08.jpeg
                 * height : null
                 */

                private Object ref;
                private Object width;
                private String url;
                private Object height;

                public Object getRef() {
                    return ref;
                }

                public void setRef(Object ref) {
                    this.ref = ref;
                }

                public Object getWidth() {
                    return width;
                }

                public void setWidth(Object width) {
                    this.width = width;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public Object getHeight() {
                    return height;
                }

                public void setHeight(Object height) {
                    this.height = height;
                }
            }
        }

        public static class EntBean {
            /**
             * liveInfo : null
             * tcount : 2428
             * picInfo : [{"ref":null,"width":null,"url":"http://cms-bucket.ws.126.net/2019/04/09/90b1fe9556c4406fb42d4053fb45f2c9.jpeg","height":null},{"ref":null,"width":null,"url":"http://cms-bucket.ws.126.net/2019/04/09/cb897cbfcd3a4d2caef4d42320a0d2bf.jpeg","height":null},{"ref":null,"width":null,"url":"http://cms-bucket.ws.126.net/2019/04/09/bcc1ee961fd04a50881e9e4e7ed31ede.jpeg","height":null}]
             * docid : 0003set664758
             * videoInfo : null
             * channel : ent
             * link : https://3g.163.com/all/photoview/0003/664758.html
             * source : 视觉中国
             * title : 林志玲穿紧身包臀裙 半蹲感谢老总
             * type : photoset
             * imgsrcFrom : null
             * imgsrc3gtype : 2
             * unlikeReason : 重复、旧闻/6,内容质量差/6
             * isTop : null
             * digest :
             * typeid : 00AJ0003|664758
             * addata : null
             * tag : 图集
             * category : 推荐
             * ptime : 2019-04-09 07:16:14
             */

            private Object liveInfo;
            private int tcount;
            private String docid;
            private Object videoInfo;
            private String channel;
            private String link;
            private String source;
            private String title;
            private String type;
            private Object imgsrcFrom;
            private int imgsrc3gtype;
            private String unlikeReason;
            private Object isTop;
            private String digest;
            private String typeid;
            private Object addata;
            private String tag;
            private String category;
            private String ptime;
            private List<PicInfoBeanXXXXXX> picInfo;

            public Object getLiveInfo() {
                return liveInfo;
            }

            public void setLiveInfo(Object liveInfo) {
                this.liveInfo = liveInfo;
            }

            public int getTcount() {
                return tcount;
            }

            public void setTcount(int tcount) {
                this.tcount = tcount;
            }

            public String getDocid() {
                return docid;
            }

            public void setDocid(String docid) {
                this.docid = docid;
            }

            public Object getVideoInfo() {
                return videoInfo;
            }

            public void setVideoInfo(Object videoInfo) {
                this.videoInfo = videoInfo;
            }

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
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

            public Object getImgsrcFrom() {
                return imgsrcFrom;
            }

            public void setImgsrcFrom(Object imgsrcFrom) {
                this.imgsrcFrom = imgsrcFrom;
            }

            public int getImgsrc3gtype() {
                return imgsrc3gtype;
            }

            public void setImgsrc3gtype(int imgsrc3gtype) {
                this.imgsrc3gtype = imgsrc3gtype;
            }

            public String getUnlikeReason() {
                return unlikeReason;
            }

            public void setUnlikeReason(String unlikeReason) {
                this.unlikeReason = unlikeReason;
            }

            public Object getIsTop() {
                return isTop;
            }

            public void setIsTop(Object isTop) {
                this.isTop = isTop;
            }

            public String getDigest() {
                return digest;
            }

            public void setDigest(String digest) {
                this.digest = digest;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public Object getAddata() {
                return addata;
            }

            public void setAddata(Object addata) {
                this.addata = addata;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getPtime() {
                return ptime;
            }

            public void setPtime(String ptime) {
                this.ptime = ptime;
            }

            public List<PicInfoBeanXXXXXX> getPicInfo() {
                return picInfo;
            }

            public void setPicInfo(List<PicInfoBeanXXXXXX> picInfo) {
                this.picInfo = picInfo;
            }

            public static class PicInfoBeanXXXXXX {
                /**
                 * ref : null
                 * width : null
                 * url : http://cms-bucket.ws.126.net/2019/04/09/90b1fe9556c4406fb42d4053fb45f2c9.jpeg
                 * height : null
                 */

                private Object ref;
                private Object width;
                private String url;
                private Object height;

                public Object getRef() {
                    return ref;
                }

                public void setRef(Object ref) {
                    this.ref = ref;
                }

                public Object getWidth() {
                    return width;
                }

                public void setWidth(Object width) {
                    this.width = width;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public Object getHeight() {
                    return height;
                }

                public void setHeight(Object height) {
                    this.height = height;
                }
            }
        }

        public static class ToutiaoBean {
            /**
             * liveInfo : null
             * tcount : 0
             * picInfo : []
             * docid : ECAPAFDE000189FH
             * videoInfo : null
             * channel :
             * link : https://3g.163.com/all/article/ECAPAFDE000189FH.html
             * source : 新华视点
             * title : 每年春天，习近平总书记都会参加这项活动
             * type : doc
             * imgsrcFrom : doc
             * imgsrc3gtype : 0
             * unlikeReason : 重复、旧闻/6,内容质量差/6
             * isTop : true
             * digest : 又是一年植树季。8日，习近平总书记参加首都义务植树活动。扶苗
             * typeid :
             * addata : null
             * tag :
             * category : 新闻
             * ptime : 2019-04-09 12:15:41
             */

            private Object liveInfo;
            private int tcount;
            private String docid;
            private Object videoInfo;
            private String channel;
            private String link;
            private String source;
            private String title;
            private String type;
            private String imgsrcFrom;
            private int imgsrc3gtype;
            private String unlikeReason;
            private boolean isTop;
            private String digest;
            private String typeid;
            private Object addata;
            private String tag;
            private String category;
            private String ptime;
            private List<?> picInfo;

            public Object getLiveInfo() {
                return liveInfo;
            }

            public void setLiveInfo(Object liveInfo) {
                this.liveInfo = liveInfo;
            }

            public int getTcount() {
                return tcount;
            }

            public void setTcount(int tcount) {
                this.tcount = tcount;
            }

            public String getDocid() {
                return docid;
            }

            public void setDocid(String docid) {
                this.docid = docid;
            }

            public Object getVideoInfo() {
                return videoInfo;
            }

            public void setVideoInfo(Object videoInfo) {
                this.videoInfo = videoInfo;
            }

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
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

            public String getImgsrcFrom() {
                return imgsrcFrom;
            }

            public void setImgsrcFrom(String imgsrcFrom) {
                this.imgsrcFrom = imgsrcFrom;
            }

            public int getImgsrc3gtype() {
                return imgsrc3gtype;
            }

            public void setImgsrc3gtype(int imgsrc3gtype) {
                this.imgsrc3gtype = imgsrc3gtype;
            }

            public String getUnlikeReason() {
                return unlikeReason;
            }

            public void setUnlikeReason(String unlikeReason) {
                this.unlikeReason = unlikeReason;
            }

            public boolean isIsTop() {
                return isTop;
            }

            public void setIsTop(boolean isTop) {
                this.isTop = isTop;
            }

            public String getDigest() {
                return digest;
            }

            public void setDigest(String digest) {
                this.digest = digest;
            }

            public String getTypeid() {
                return typeid;
            }

            public void setTypeid(String typeid) {
                this.typeid = typeid;
            }

            public Object getAddata() {
                return addata;
            }

            public void setAddata(Object addata) {
                this.addata = addata;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getPtime() {
                return ptime;
            }

            public void setPtime(String ptime) {
                this.ptime = ptime;
            }

            public List<?> getPicInfo() {
                return picInfo;
            }

            public void setPicInfo(List<?> picInfo) {
                this.picInfo = picInfo;
            }
        }
    }
}
