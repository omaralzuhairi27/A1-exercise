
daten=$( curl -s --insecure https://api.universallock.net:8080/api/ping)

zeitstempel=$(date +%Y-%m-%dT%H:%M:%S)
echo "Ergebnis: " $daten:  $zeitstempel


logger $daten $zeitstempel
tail -2 /var/log/syslog
