import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.inspur.hdfs.util.FileSystemUtil;

public class HdfsTest {

	public static void main(String[] args) throws IOException {

		String path = "/peixun";
		String fileName = "";
		try {
			// 测试查询文件列表
			List<Map> fileList = FileSystemUtil
					.listFileStatuses(path, fileName);
			System.out.println("目录" + path + "下的文件列表如下：" + fileList);

		/*	// 测试创建目录
			String newDirPath = "/peixun/newDir";
			boolean result = FileSystemUtil.mkdir(newDirPath);
*/
			/*// 测试创建文件
			String newFilePath ="/peixun/newFile";
			boolean result1 = FileSystemUtil.createFile(newFilePath);*/
			
			/*//测试重命名文件
			String oldFilePath="/peixun/newFile";
			String newFilePath ="/peixun/newName";
			boolean result2 =FileSystemUtil.rename(oldFilePath, newFilePath);*/
			
		    /*//测试删除文件
			String deleteFilePath = "/peixun/newName";
			boolean result3 = FileSystemUtil.deleteFile(deleteFilePath);*/	
			
			/*//测试删除目录
			String deleteDirPath ="/peixun/newDir";
			boolean result4 = FileSystemUtil.deleteFile(deleteDirPath);*/
			
			/*//测试将文件从本地磁盘拷贝到hdfs
			String localPath = "C:\\Users\\huxiaoqing\\Desktop\\hbase-client-1.1.1.jar";
			String hdfsPath ="/peixun";
			FileSystemUtil.copyFromLocalFile(localPath, hdfsPath);*/
			
			/*//测试读文件
			String fileDir ="/peixun/file1.txt";
			FileSystemUtil.readHDFSFile(fileDir);*/
			
			/*//测试以输入流方式上传文件到hdfs
			String uploadPath="/peixun/uploadfile";
			File localFile=new File("C:\\Users\\huxiaoqing\\Desktop\\file2.txt");
			FileInputStream in = new FileInputStream(localFile);
			FileSystemUtil.uploadFile(in, uploadPath);
			in.close();*/
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
