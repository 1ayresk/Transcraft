$client = New-Object system.net.WebClient;
$client.DownloadFile("http://files.minecraftforge.net/ForgeMultipart/ForgeMultipart-dev-1.6.4-1.0.0.233.jar",".\FMP.jar");
$client.DownloadFile("http://www.chickenbones.craftsaddle.org/Files/New_Versions/1.6.4/CodeChickenCore-dev%200.9.0.7.jar", "\\CCC.jar");
$client.DownloadFile("http://www.chickenbones.craftsaddle.org/Files/New_Versions/1.6.4/NotEnoughItems-dev%201.6.1.8.jar", "%\\NEI.jar");
$client.DownloadFile("http://files.minecraftforge.net/CodeChickenLib/CodeChickenLib-dev-1.6.4-1.0.0.49.jar", "\\CL.jar");