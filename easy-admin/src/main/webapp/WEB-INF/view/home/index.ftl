<@override name="title">index</@override>

<@override name="container">
<form class="form-signin">
    <h2 class="form-signin-heading">请登录</h2>
    <label for="inputEmail" class="sr-only">用户名</label>
    <input type="email" id="inputEmail" class="form-control" placeholder="用户名" required autofocus>
    <label for="inputPassword" class="sr-only">密码</label>
    <input type="password" id="inputPassword" class="form-control" placeholder="密码" required>
    <div class="checkbox">
        <label>
            <input type="checkbox" value="remember-me"> 记住
        </label>
    </div>
    <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
</form>
</@override>

<#--css-->
<@override name="css">
<link rel="stylesheet" href="/assets/projects/index/css/login.css">
</@override>

<#--javascript-->
<@override name="javascript">

</@override>

<@extends name="include/base.ftl"/>
