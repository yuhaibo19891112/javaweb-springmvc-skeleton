<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="UTF-8" name="viewport"
          content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0"/>
    <meta name="screen-orientation" content="portrait">
    <meta name="x5-orientation" content="portrait">
    <meta name="renderer" content="webkit"/>
    <meta http-equiv="X-UA-Compatible" content="IE=Edge"/>
    <@block name="seo">
        <title><@block name="title">句容私家车俱乐部</@block></title>
        <meta name="keywords" content='<@block name="keywords">句容私家车俱乐部</@block>'/>
        <meta name="description" content='<@block name="description">句容私家车俱乐部</@block>'/>
    </@block>

    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="/assets/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/assets/common/css/common.css">
    <@block name="css" />
</head>

<body>

    <header class="header">
        <#include "include/header.ftl"/>
    </header>

    <div class="container">
        <@block name="container" />
    </div>

    <footer class="footer">
        <#include "include/footer.ftl"/>
    </footer>

    <script src="/assets/plugins/jquery/jquery-3.2.1.min.js"></script>
    <script src="/assets/plugins/bootstrap/js/bootstrap.min.js"></script>
    <@block name="javascript" />

</body>

</html>