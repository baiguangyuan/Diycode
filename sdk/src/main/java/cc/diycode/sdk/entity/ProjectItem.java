package cc.diycode.sdk.entity;

/*********************************************
 *
 * @author shuke on 2017/10/27.
 ********************************************/

public class ProjectItem {

    /**
     * id : 27125
     * name : Swift-MMP
     * description : Material-design Music Player written by Swift for iOS. 使用 Swift 语言编写的 Material Design 风格的 iOS 流媒体音乐播放器，简称 MMP。
     * readme : ![](https://diycode.b0.upaiyun.com/photo/2017/a42b2f59fcf1a29ead106f160a6ef9e1.png)

     ### [中文介绍](#介绍)

     ## Features

     - [x] Stream audio playing
     - [x] Lock screen control enabled
     - [x] Apple Watch control enabled
     - [x] Elegant UI

     ## Examples

     ### iPhone

     ![](https://diycode.b0.upaiyun.com/photo/2017/940cf1dd2c2a4e62117ca15052d3b41e.png)

     ### Apple Watch

     ![](https://diycode.b0.upaiyun.com/photo/2017/2dfef4d88d09ac72f01b23f00f5cfd7a.png)

     ## Requirements

     * iOS 9.3+
     * Xcode 8

     ## Contribution

     You are welcome to fork and submit pull requests.

     ## License

     Swift-MMP is open-sourced software licensed under the MIT license.

     # 介绍

     使用 Swift 语言编写的 Material Design 风格的 iOS 流媒体音乐播放器，简称 MMP。基于 [DOUAudioStreamer-Swift](https://github.com/johnlui/DOUAudioStreamer-Swift)。

     ## Features

     - [x] 完全流媒体播放
     - [x] 锁屏信息展示及控制
     - [x] Apple Watch 展示及控制
     - [x] 界面简介优雅

     ## 示例

     ### 手机

     ![](https://diycode.b0.upaiyun.com/photo/2017/84e7f23934b6cec940934b34b4065d76.png)

     ### Apple Watch
     ![](https://diycode.b0.upaiyun.com/photo/2017/2dfef4d88d09ac72f01b23f00f5cfd7a.png)

     ## 环境要求

     * iOS 9.3+
     * Xcode 8

     ## 参与开源

     欢迎提交 issue 和 PR，大门永远向所有人敞开。

     ## 开源协议

     本项目遵循 MIT 协议开源，具体请查看根目录下的 LICENSE 文件。
     * github : https://github.com/johnlui/Swift-MMP
     * website :
     * download : https://api.github.com/repos/johnlui/Swift-MMP/zipball
     * star : 227
     * fork : 42
     * watch : 10
     * project_cover_url : https://diycode.b0.upaiyun.com/developer_user/avatar/274.jpg
     * label_str : Music Player,Swift,iOS
     * category : {"name":"iOS","id":2}
     * sub_category : {"name":"开源 App(OpenSourcesoftware)","id":35}
     * last_updated_at : 2017-10-24T14:04:34.000+08:00
     */

    public int id;
    public String name;
    public String description;
    public String readme;
    public String github;
    public String website;
    public String download;
    public int star;
    public int fork;
    public int watch;
    public String project_cover_url;
    public String label_str;
    public CategoryItem category;
    public CategoryItem sub_category;
    public String last_updated_at;
}
