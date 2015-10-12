package com.yfeng.more.money.medium;

import java.util.ArrayList;
import java.util.List;

import com.yfeng.more.money.common.Interval;

public class InsertInterval {

	public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result = new ArrayList<Interval>();
        for(Interval interval : intervals){
        	if(interval.end < newInterval.start){
        		result.add(interval);
        		continue;
        	}
        	if(interval.start > newInterval.end){
        		result.add(newInterval);
        		newInterval = interval;
        		continue;
        	}
        	newInterval = new Interval(Math.min(interval.start, newInterval.start), Math.max(interval.end, newInterval.end));
        }
        return result;
    }
}
