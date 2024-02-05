import socket
import pandas as pd

def get_local_ip():
    try:
        # Get the hostname of the local machine
        host_name = socket.gethostname()

        # Get the local IP address
        local_ip = socket.gethostbyname(host_name)

        return local_ip
    except Exception as e:
        print(f"Error: {e}")
        return None

# Get and print the local IP address
local_ip = get_local_ip()
print(f"Your local IP address is: {local_ip}")
