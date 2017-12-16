package com.machine.filling;

import com.machine.filling.util.Common;
import com.machine.filling.util.OkHttpUtils;
import com.zhy.http.okhttp.callback.Callback;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by LENOVO on 2017/12/16.
 */

public class APIHttpManager {
    private static APIHttpManager apiHttpManager;
    private Map<String, String> requestParams;

    private APIHttpManager() {

    }

    public static APIHttpManager getInstance() {
        if (apiHttpManager == null) {
            apiHttpManager = new APIHttpManager();
        }
        return apiHttpManager;
    }


    /**
     * 登陆
     *
     * @param userName 用户名
     * @param pwd      密码
     * @param deviceId 设备id 唯一标识
     * @param callback
     */
    public void login(String userName, String pwd, String deviceId, Callback callback) {
        requestParams = new HashMap<>();
        requestParams.put("userName", userName);
        requestParams.put("pwd", pwd);
        requestParams.put("deviceId", deviceId);
        OkHttpUtils.postDataMap(Common.HTTP_BASE_URL + Common.HTTP_LOGIN, requestParams, callback);
    }

    /**
     * 获取油站信息
     * @param num  油站编号
     * @param callback
     */
    public void getOilStationInfo(String num, Callback callback) {
        requestParams = new HashMap<>();
        requestParams.put("num", num);
        OkHttpUtils.postDataMap(Common.HTTP_BASE_URL + Common.HTTP_OIL_STATION_INFO, requestParams, callback);
    }

    /**
     * 获取油机列表
     * @param sellerId  油站id
     * @param callback
     */
    public void getOilMachineList(String sellerId, Callback callback) {
        requestParams = new HashMap<>();
        requestParams.put("sellerId", sellerId);
        OkHttpUtils.postDataMap(Common.HTTP_BASE_URL + Common.HTTP_OIL_MACHINE_LIST, requestParams, callback);
    }

    /**
     * 获取油品列表
     * @param sellerId  油站id
     * @param callback
     */
    public void getOilTypeList(String sellerId, Callback callback) {
        requestParams = new HashMap<>();
        requestParams.put("sellerId", sellerId);
        OkHttpUtils.postDataMap(Common.HTTP_BASE_URL + Common.HTTP_OIL_TYPE_LIST, requestParams, callback);
    }

    /**
     * 获取油罐列表
     * @param sellerId  油站id
     * @param callback
     */
    public void getOilTankList(String sellerId, Callback callback) {
        requestParams = new HashMap<>();
        requestParams.put("sellerId", sellerId);
        OkHttpUtils.postDataMap(Common.HTTP_BASE_URL + Common.HTTP_OIL_TANK_LIST, requestParams, callback);
    }

    /**
     * 获取油枪列表
     * @param sellerId  油站id
     * @param callback
     */
    public void getOilGunList(String sellerId, Callback callback) {
        requestParams = new HashMap<>();
        requestParams.put("sellerId", sellerId);
        OkHttpUtils.postDataMap(Common.HTTP_BASE_URL + Common.HTTP_OIL_GUN_LIST, requestParams, callback);
    }

    /**
     * 获取油枪详情
     * @param gunId  油枪id
     * @param callback
     */
    public void getOilGunDetail(String gunId, Callback callback) {
        requestParams = new HashMap<>();
        requestParams.put("gunId", gunId);
        OkHttpUtils.postDataMap(Common.HTTP_BASE_URL + Common.HTTP_OIL_GUN_DETAIL, requestParams, callback);
    }

    /**
     * 添加油枪
     * @param sellerId  油站id
     * @param machineId 油机id
     * @param potId  油罐id
     * @param num  油枪编号
     * @param name  油枪名称
     * @param initAmount  初始表数（毫升）
     * @param portNum 串口号
     * @param callback
     */
    public void addOilGunInfo(String sellerId, String machineId,String potId,String num,String name,String initAmount,String portNum,Callback callback) {
        requestParams = new HashMap<>();
        requestParams.put("sellerId", sellerId);
        requestParams.put("machineId", machineId);
        requestParams.put("potId", potId);
        requestParams.put("num", num);
        requestParams.put("name", name);
        requestParams.put("initAmount", initAmount);
        requestParams.put("portNum", portNum);
        OkHttpUtils.postDataMap(Common.HTTP_BASE_URL + Common.HTTP_ADD_OIL_GUN_INFO, requestParams, callback);
    }

    /**
     * 修改油枪 信息
     * @param sellerId  油站id
     * @param machineId 油机id
     * @param potId  油罐id
     * @param num  油枪编号
     * @param name  油枪名称
     * @param initAmount  初始表数（毫升）
     * @param portNum 串口号
     * @param callback
     */
    public void modifyOilGunInfo(String sellerId, String machineId,String potId,String num,String name,String initAmount,String portNum,Callback callback) {
        requestParams = new HashMap<>();
        requestParams.put("sellerId", sellerId);
        requestParams.put("machineId", machineId);
        requestParams.put("potId", potId);
        requestParams.put("num", num);
        requestParams.put("name", name);
        requestParams.put("initAmount", initAmount);
        requestParams.put("portNum", portNum);
        OkHttpUtils.postDataMap(Common.HTTP_BASE_URL + Common.HTTP_MODIFY_OIL_GUN_INFO, requestParams, callback);
    }

    /**
     *  初始化终端完毕，调用获取token令牌，进入主界面
     * @param sellerId  油站id
     * @param machineId  油机id
     * @param machineNum  油机编号
     * @param deviceId  设备id唯一识别码
     * @param callback
     */
    public void getToken(String sellerId,String machineId,String machineNum,String deviceId,Callback callback){
        requestParams = new HashMap<>();
        requestParams.put("sellerId", sellerId);
        requestParams.put("machineId", machineId);
        requestParams.put("machineNum", machineNum);
        requestParams.put("deviceId", deviceId);
        OkHttpUtils.postDataMap(Common.HTTP_BASE_URL + Common.HTTP_MODIFY_OIL_GUN_INFO, requestParams, callback);
    }
}