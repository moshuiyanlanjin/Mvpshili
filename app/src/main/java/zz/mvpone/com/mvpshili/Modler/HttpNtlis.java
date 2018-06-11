package zz.mvpone.com.mvpshili.Modler;

/**
 * Created by Administrator on 2017/12/5.
 */

public class HttpNtlis {
    //测试
    public static final String IP = "http://118.190.158.161:8080/xbdz-background/sp/";
    //本地
    public static final String IP1= "http://192.168.0.124:8080/xbdz-background/sp/";
    //线上
    public static final String IP2= "http://91xiakexing.com/xbdz-background/sp/";

    //登陆
    public static final String login = IP2+"screenLogin/login";
    //轮播图
    public static final String lunbo = IP2+"appProductsApi/findProductsResourcesList";
    //商品详情
    public static final String commod = IP2+"appProductsApi/findProducts";
    //推荐商品
    public static final String recommend = IP2+"appProductsApi/findTecommendProducts";
    //搜索商品
    public static final String seekshow = IP2+"appProductsApi/findProductsList";
    //首页下拉刷新推荐
    public static final String fullrecommend = IP2+"appProductsApi/findProductsSaleList";
    //分类一级菜单
    public static final String recommendone = IP2+"appProductsApi/findSpeciesList";
    //分类二级菜单
    public static final String recommendtwo = IP2+"appProductsApi/findSpeciesProductsList ";
    //购物车上传参数
    public static final String Shoppingjson = IP2+"screenProductsApi/screenProducts";
    //验证码
    public static final String Authcode = IP2+"moblie/sendCode";
    //密码登陆
    public static final String SigninPas = IP2+"moblie/passWordlogin";
    //验证吗登陆
    public static final String codeLogin = IP2+"moblie/codeLogin";
    //密码注册
    public static final String PassPas = IP2+"moblie/editPassWord";
    //判断是否注册
    public static final String Judge = IP2+"moblie/findMobile";
    //添加购物车
    public static final String addshipe = IP2+"shoppingCarApi/addProductsCart";
    //购物车
    public static final String shopping = IP2+"shoppingCarApi/shoppingCart";
    //购物车删除商品
    public static final String deleshopp = IP2+"shoppingCarApi/delectShoppingCart";
    //获取所有配送地址
    public static final String alladdresses = IP2+"appAddressApi/getAddAddress";
    //获取三级地址
    public static final String ssqaddresses = IP2+"appAddressApi/linkageArea";
    //添加收货地址
    public static final String saveAddress = IP2+"appAddressApi/saveAddress";
    //获取某个地址
    public static final String addressEdit = IP2+"appAddressApi/addressEdit";
    //修改某个地址
    public static final String updataAddress = IP2+"appAddressApi/updataAddress";
    //删除某个地址
    public static final String deleteAddress = IP2+"appAddressApi/deleteAddress";
    //我的订单
    public static final String getUserOrder = IP2+"appUserOrderApi/getUserOrder";
    //订单操作
    public static final String OrderStatus = IP2+"appUserOrderApi/cancelOrder";
    //购物车生成订单
    public static final String shoppcreateorder = IP2+"appPayOrderApi/geiPayOrderMessage";
    //首页优惠券
    public static final String maindiscountcoupon = IP2+"appUserCouponsApi/findGetCoupon";
    //我的优惠券
    public static final String mydiscountcoupon = IP2+"appUserCouponsApi/myCoupons";
    //一键领取优惠券
    public static final String linquyouhui = IP2+"appUserCouponsApi/receiveCoupons";
    //支付
    public static final String zhifu = IP2+"appPayOrderApi/saveOrder";
    //获取当前客户信息
    public static final String getUserMessage = IP2+"appMyApi/getUserMessage";
    //设置用户信息
    public static final String editUserMessage = IP2+"appMyApi/editUserMessage";
    //判断物流
    public static final String getDeliveryType = IP2+"appUserOrderApi/getDeliveryType";
    //查看物流
    public static final String logistics = IP2+"appUserOrderApi/logistics";
    //代付款支付
    public static final String payment = IP2+"appPayOrderApi/payment";
    //判断支付
    public static final String getOrderPayType = IP2+"appPayOrderApi/getOrderPayType";
    //新增发货箱
    public static final String addcase = IP2+"psAppsSupplierApi/addNewCase";
    //查询发货箱
    public static final String findCase = IP2+"psAppsSupplierApi/findCase";
    //发货箱下扫二维码
    public static final String qrCodeStockUp = IP2+"psAppsSupplierApi/qrCodeStockUp";
    //发货箱下详情
    public static final String findCaseorder = IP2+"psAppsSupplierApi/findCaseorder";
    //取货供应商
    public static final String findSupplier = IP2+"psAppsSupplierApi/findSupplier";
    //供应商下的箱子
    public static final String findSupplierCase = IP2+"psAppsSupplierApi/findSupplierCase";
    //取货箱扫描
    public static final String qrCodeClubGoods = IP2+"psAppsSupplierApi/qrCodeClubGoods";
    //取货箱详情
    public static final String findCaseOrderClubGoods = IP2+"psAppsSupplierApi/findCaseOrderClubGoods";
    //下单发货门店
    public static final String findDeliveryStores = IP2+"psAppsSupplierApi/findDeliveryStores";
    //下单门店下箱
    public static final String findCaseList = IP2+"psAppsSupplierApi/findCaseList";
    //下单
    public static final String placeOrder = IP2+"psAppsSupplierApi/placeOrder";
    //备货删除箱
    public static final String delectCase = IP2+"psAppsSupplierApi/delectCase";
    //备货箱下订单删除
    public static final String delectStockUp = IP2+"psAppsSupplierApi/delectStockUp";
}
