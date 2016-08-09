package com.qfeng.demo03;

import java.util.List;

/**
 * Created by innershows on 16/8/9.
 *
 * @author innershows
 * @date 16/8/9
 * @e_mail innershow@gmail.com
 */
public class Data {

    /**
     * error_code : 0
     * cid_rel : 207
     * result : [{"id":"21697","title":"LOL每周英雄趋势解析 新英雄金克丝独领风骚","comment_count":0,"source":"","icon":"","short":"英雄趋势分析（10月22日/2013）*以下数据来自欧美服务器本周抢眼英雄非暴走萝莉..."},{"id":"21685","title":"新头像登陆测试服：新一轮送头像活动将开启","comment_count":0,"source":"178","icon":"","short":"PBE即将添加新的头像，每个头像获得方式都不一样。鬼魂男孩：为你的朋友购买一份\u201c..."},{"id":"21658","title":"TSM.Xpecial教你玩暴走萝莉金克丝","comment_count":0,"source":"多玩网","icon":"","short":"本文由多玩LOL论坛[Freepoet]原创，与作者交流可[点击进入论坛原帖]，..."},{"id":"21653","title":"猩队：五名替补队员加入 出战阵容不会变动","comment_count":0,"source":"巴士","icon":"","short":"本站讯：TSM猩猩队长在最新的视频日志中公布，TSM将会纳入五名新替补队员，每个..."},{"id":"21619","title":"英雄联盟王牌搭档","comment_count":0,"source":"","icon":"","short":"英雄联盟里每个英雄都有着自己独特的技能，这些技能也都有着不同的效果。有的拥有很高..."},{"id":"21618","title":"LOL钻石组大神技巧分享 S3赛季末冲分小细节","comment_count":0,"source":"网易","icon":"","short":"LOL钻石组大神技巧分享S3赛季末冲分小细节S3赛季结算还有不到2周时间就要结束..."},{"id":"21617","title":"今日英雄联盟新军团系统全大区发布公告","comment_count":0,"source":"","icon":"","short":"亲爱的LOL玩家：LOL新军团系统于10月23日开放全部LOL服务器大区。新军团系..."},{"id":"21616","title":"电竞有钱途 LOL选手透露一年净赚百万美元","comment_count":0,"source":"","icon":"","short":"如果你还认为玩电竞的都没前途，那真的就太落伍了。Carlos\"Ocelote\"R..."},{"id":"21615","title":"体操王子陈一冰宣布退役 自曝LOL从未5杀","comment_count":0,"source":"","icon":"","short":"腾讯游戏讯10月23日消息，近日，体操奥运冠军陈一冰通过微博正式宣布退役，\u201c从5岁..."},{"id":"21614","title":"WCG各国参赛队伍名单出炉 闪电狼力争出线","comment_count":0,"source":"巴士","icon":"","short":"本站讯：WCG各国代表队情况，以及中国台湾选拔赛情况介绍，代替橘子熊出战的闪电狼..."}]
     * recomm : []
     */

    private String error_code;
    private int cid_rel;
    /**
     * id : 21697
     * title : LOL每周英雄趋势解析 新英雄金克丝独领风骚
     * comment_count : 0
     * source :
     * icon :
     * short : 英雄趋势分析（10月22日/2013）*以下数据来自欧美服务器本周抢眼英雄非暴走萝莉...
     */

    private List<ResultEntity> result;
    private List<?> recomm;

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public int getCid_rel() {
        return cid_rel;
    }

    public void setCid_rel(int cid_rel) {
        this.cid_rel = cid_rel;
    }

    public List<ResultEntity> getResult() {
        return result;
    }

    public void setResult(List<ResultEntity> result) {
        this.result = result;
    }

    public List<?> getRecomm() {
        return recomm;
    }

    public void setRecomm(List<?> recomm) {
        this.recomm = recomm;
    }

    public static class ResultEntity {
        private String id;
        private String title;
        private int comment_count;
        private String source;
        private String icon;
        @com.google.gson.annotations.SerializedName("short")
        private String shortX;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getComment_count() {
            return comment_count;
        }

        public void setComment_count(int comment_count) {
            this.comment_count = comment_count;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getShortX() {
            return shortX;
        }

        public void setShortX(String shortX) {
            this.shortX = shortX;
        }

        @Override
        public String toString() {
            return "ResultEntity{" +
                    "id='" + id + '\'' +
                    ", title='" + title + '\'' +
                    ", comment_count=" + comment_count +
                    ", source='" + source + '\'' +
                    ", icon='" + icon + '\'' +
                    ", shortX='" + shortX + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Data{" +
                "error_code='" + error_code + '\'' +
                ", cid_rel=" + cid_rel +
                ", result=" + result +
                ", recomm=" + recomm +
                '}';
    }
}
