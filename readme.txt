
jar -vcf ../../../package/examprep.jar .



git config --global http.proxy http://proxyuser:proxypwd@proxy.server.com:8080
change the following:
proxyuser = your personnel number
proxypwd = your windows password
proxy.server.com = w...za


•	change 8080 to the proxy port configured on your proxy server

If you decide at any time to reset this proxy and work without proxy:
Command to use:
git config --global --unset http.proxy

Finally, to check the currently set proxy:
git config --global --get http.proxy

