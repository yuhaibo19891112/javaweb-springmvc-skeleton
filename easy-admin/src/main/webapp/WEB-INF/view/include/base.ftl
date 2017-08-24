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

    <link href="/assets/common_umix/css/common.css" rel="stylesheet">
    <@block name="css" />
</head>

<body>

    <header>
        <div>头</div>
    </header>

    <div class="content">
        <@block name="content" />
    </div>

    <footer>
        <div>尾</div>
    </footer>

    <script src="/assets/common_umix/script/lib.js"></script>
    <@block name="javascript" />

</body>

</html>