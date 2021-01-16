package com.taotao.rest.service;

import com.taotao.pojo.TaotaoResult;

public interface ItemService {
	public TaotaoResult getItemBaseInfo(long itemId);
	
	public TaotaoResult getItemDesc(long itemId);
	
	public TaotaoResult getItemParam(long itemId);
}
