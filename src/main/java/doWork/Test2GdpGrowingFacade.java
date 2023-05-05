package doWork;

import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test2GdpGrowingFacade {

    public static void main(String[] args) {
        Map<String, Object> params = new HashMap();
        params.put("mSkuId", "");
        params.put("pid", "");
        params.put("minSkuSize", 2);
        params.put("maxSkuSize", 10);
        params.put("cateTabMaxSize", 5);
        params.put("asyncLoadingCate3Id", "all");
        Set<Integer> fieldSet = new HashSet<>();
        params.put("fieldSet", fieldSet);
        fieldSet.add(1);
        fieldSet.add(2);
        String s = "";

        System.out.println(JSONObject.toJSON(params));

    }
}
