package com.dayuarchi.tool.mybatisgenerator.dao;

import com.dayuarchi.tool.mybatisgenerator.model.TpTradeRate;
import com.dayuarchi.tool.mybatisgenerator.model.TpTradeRateCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TpTradeRateMapper {
    int countByExample(TpTradeRateCriteria example);

    int deleteByExample(TpTradeRateCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(TpTradeRate record);

    int insertSelective(TpTradeRate record);

    List<TpTradeRate> selectByExampleWithRowbounds(TpTradeRateCriteria example, RowBounds rowBounds);

    List<TpTradeRate> selectByExample(TpTradeRateCriteria example);

    TpTradeRate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TpTradeRate record, @Param("example") TpTradeRateCriteria example);

    int updateByExample(@Param("record") TpTradeRate record, @Param("example") TpTradeRateCriteria example);

    int updateByPrimaryKeySelective(TpTradeRate record);

    int updateByPrimaryKey(TpTradeRate record);
}