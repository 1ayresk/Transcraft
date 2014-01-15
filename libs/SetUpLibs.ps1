$client = New-Object system.net.WebClient;
write-output "Downloading Forge Multipart";
$client.DownloadFile("http://files.minecraftforge.net/ForgeMultipart/ForgeMultipart-dev-1.6.4-1.0.0.233.jar","FMP.jar");
write-output "Downloaded Forge Multipart";
write-output "Downloading Code Chicken Core";
$client.DownloadFile("http://www.chickenbones.craftsaddle.org/Files/New_Versions/1.6.4/CodeChickenCore-dev%200.9.0.7.jar", "CCC.jar");
write-output "Downloaded Code Chicken Core";
write-output "Downloading Not Enough Items";
$client.DownloadFile("http://www.chickenbones.craftsaddle.org/Files/New_Versions/1.6.4/NotEnoughItems-dev%201.6.1.8.jar", "NEI.jar");
write-output "Downloaded Not Enough Items";
write-output "Downloading Code Chicken Lib";
$client.DownloadFile("http://files.minecraftforge.net/CodeChickenLib/CodeChickenLib-dev-1.6.4-1.0.0.49.jar", "CCL.jar");
write-output "Downloaded Code Chicken Lib";
write-output "Downloading Waila";
$client.DownloadFile("https://dl.dropboxusercontent.com/u/164771/MC%20Modding/Waila/Waila_1.4.4b.zip", "WAILA.jar");
write-output "Downloaded Code Waila";

