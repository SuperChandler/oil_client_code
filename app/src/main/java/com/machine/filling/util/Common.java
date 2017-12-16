package com.machine.filling.util;


public class Common {
	/**
	 * IP地址（http）
	 */
	public static final String HTTP_BASE_URL = "";

	/**
	 * 登录
	 */
	public static final String HTTP_LOGIN = "/client-ws-server/init/login";

	/**
	 * 油站信息
	 */
	public static final String HTTP_OIL_STATION_INFO = "/client-ws-server/init/seller";

	/**
	 * 油机列表
	 */
	public static final String HTTP_OIL_MACHINE_LIST = "/client-ws-server/init/machines";

	/**
	 * 油品列表
	 */
	public static final String HTTP_OIL_TYPE_LIST = "/client-ws-server/init/types";

	/**
	 * 油罐列表
	 */
	public static final String HTTP_OIL_TANK_LIST = "/client-ws-server/init/pots";

	/**
	 * 油枪列表
	 */
	public static final String HTTP_OIL_GUN_LIST = "/client-ws-server/init/guns";

	/**
	 * 油枪详情
	 */
	public static final String HTTP_OIL_GUN_DETAIL = "/client-ws-server/init/gunDetail";

	/**
	 * 添加油枪信息
	 */
	public static final String HTTP_ADD_OIL_GUN_INFO = "/client-ws-server/init/add";

	/**
	 * 修改油枪信息
	 */
	public static final String HTTP_MODIFY_OIL_GUN_INFO = "/client-ws-server/init/edit";

	/**
	 * 初始化终端完毕，调用获取token令牌，进入主界面
	 */
	public static final String HTTP_GET_TOKEN = "/client-ws-server/init/in";






	// 读表
	public static final int CMD_TYPE_READMETER = 0;
	// 开阀
	public static final int CMD_TYPE_OPENVAVLE = 1;
	// 关阀
	public static final int CMD_TYPE_CLOSEVAVLE = 2;
	// 开阀
	public static final int XT_OPENVAVLE = 0;
	// 关阀
	public static final int XT_CLOSEVAVLE = 1;

	/**
	 * 设备上报数据
	 */
	public static final String MSG_TYPE_DEVICEREQ = "deviceReq";
	/**
	 * 设备正常应答消息
	 */
	public static final String MSG_TYPE_DEVICERSP = "deviceRsp";

	// 平台下发请求
	public static final String MSG_TYPE_CLOUDREQ = "cloudReq";
	// 平台收到设备数据后对设备的应答
	public static final String MSG_TYPE_CLOUDRSP = "cloudRsp";

	// 命令发送关键字 平台向设备命令下发数据关键字
	public static final String SET_REPORT_FREQ_VAL = "SET_REPORT_FREQ_VAL";
	public static final String SET_SERVER_IP_PORT = "SET_SERVER_IP_PORT";
	public static final String SET_APN = "SET_APN";
	public static final String SET_REPORT_RANDOM_PERIOD = "SET_REPORT_RANDOM_PERIOD";
	public static final String SET_REPORT_RETRY_TIMES = "SET_REPORT_RETRY_TIMES";
	public static final String SET_REPORT_START_TIME = "SET_REPORT_START_TIME";
	public static final String GET_CONFIG = "GET_CONFIG";
	public static final String SET_HIGHFLOW_ALARM = "SET_HIGHFLOW_ALARM";

	// 各个命令对应错误字符串码
	public static final String CODE_SET_REPORT_FREQ_VAL = "68000016";
	public static final String CODE_SET_SERVER_IP_PORT = "68111116";
	public static final String CODE_SET_APN = "68222216";
	public static final String CODE_SET_REPORT_RANDOM_PERIOD = "68333316";
	public static final String CODE_SET_REPORT_RETRY_TIMES = "68444416";
	public static final String CODE_SET_REPORT_START_TIME = "68555516";
	public static final String CODE_GET_CONFIG = "68666616";
	public static final String CODE_SET_HIGHFLOW_ALARM = "68777716";

	public static final String CODE_LOGIN = "68888816";
	public static final String CODE_UPLOAD_RSP = "68999916";
}
