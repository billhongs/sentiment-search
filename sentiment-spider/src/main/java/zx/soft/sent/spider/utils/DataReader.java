package zx.soft.sent.spider.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 代理数据读取
 * 
 * @author wanggang
 *
 */
public class DataReader {

	public static void main(String[] args) {

		List<String> proxy = DataReader.getProxyIPs("proxy/proxy-ips.txt");
		for (String ip : proxy) {
			System.out.println(ip);
		}
	}

	public static List<String> getProxyIPs(String file) {
		List<String> result = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(new File(file)));) {
			String str;
			while ((str = br.readLine()) != null) {
				result.add(str);
			}
			return result;
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
