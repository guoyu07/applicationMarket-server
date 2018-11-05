package com.techwells.applicationMarket.service;

import org.springframework.transaction.annotation.Transactional;

import com.techwells.applicationMarket.domain.Wallet;
import com.techwells.applicationMarket.domain.WalletDetail;
import com.techwells.applicationMarket.util.PagingTool;

/**
 * 模板的service
 * @author 陈加兵
 */
@Transactional
public interface WalletService {
	
	
	/**
	 * 添加钱包
	 * @param wallet
	 * @return
	 * @throws Exception
	 */
	Object addWallet(Wallet wallet)throws Exception;
	
	/**
	 * 根据钱包Id获取信息
	 * @param walletId
	 * @return
	 * @throws Exception
	 */
	Object getWalletById(Integer walletId)throws Exception;
	
	
	/**
	 * 修改钱包
	 * @param wallet
	 * @return
	 * @throws Exception
	 */
	Object modifyWallet(Wallet wallet)throws Exception;
	
	/**
	 * 根据钱包Id删除数据
	 * @param walletId
	 * @return
	 * @throws Exception
	 */
	Object deleteWallet(Integer walletId)throws Exception;
	
	/**
	 * 分页获取钱包数据
	 * @param pagingTool
	 * @return
	 * @throws Exception
	 */
	Object getWalletList(PagingTool pagingTool)throws Exception;
	
	
	/**
	 * 根据钱包Id获取钱包
	 * @param walletId
	 * @return
	 * @throws Exception
	 */
	Wallet getWallet(Integer walletId)throws Exception;

	/**
	 * 重置钱包
	 * @param wallet
	 * @return
	 */
	Object resetWallet(Wallet wallet)throws Exception;

	/**
	 * 转账
	 * @param detail  钱包明细
	 * @param pwd  钱包密码
	 * @return
	 * @throws Exception
	 */
	Object transfer(WalletDetail detail, String pwd)throws Exception;

	/**
	 * 获取明细详情
	 * @param detailId
	 * @return
	 * @throws Exception
	 */
	Object getDetail(Integer detailId)throws Exception;

	
	/**
	 * 获取钱包明细，分页，按照分页获取
	 * @param pagingTool
	 * @return
	 * @throws Exception
	 */
	Object getWalletDetail(PagingTool pagingTool)throws Exception;

	/**
	 * 获取钱包管理
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	Object getWalletManage(Integer userId)throws Exception;

	/**
	 * 切换钱包
	 * @param userId  用户Id
	 * @param walletId  钱包Id
	 * @return
	 * @throws Exception
	 */
	Object change(Integer userId, Integer walletId)throws Exception;

	/**
	 * 分页获取任务详情
	 * @param pagingTool
	 * @return
	 * @throws Exception
	 */
	Object getWalletDetailBack(PagingTool pagingTool)throws Exception;

	/**
	 * 根据用户Id和钱包类型获取钱包
	 * @param userId
	 * @param walletType
	 * @return
	 * @throws Exception
	 */
	Object getAddress(Integer userId,Integer walletType)throws Exception;
	
	
	
	
}
