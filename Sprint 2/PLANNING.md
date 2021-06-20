# RCOMP 2020/2021 - Project - Sprint 2

## Packet Tracer

All team's member have the same version - 8.0.0.0212.

## Devices Naming

- Hostname MCC:
	- MCC
	
- Hostname ICC:
	- ICC_BuildingX (X - building number)
	
- Hostname HCC:
	- HCC_BX_FY (X - Building number ) (Y - Floor number)
	
- Hostname CP: TROCAR
     - CPXBY (X - identifier number) (Y - Building Number)
	
- Hostname Router:
    - routerBuildingX (X - Building number)
    
- Hostname AP:
     - AP_BX_FY_Z (X - Building number) (Y - Floor number) (Z - identifier number)
    
- Hostname Server:
    - ServerBX_Y (X - Building number) (Y - identifier number)
    
- Hostname PC:
    - PCFloorX_Y (X - Floor number) (Y - identifier number)
    
- Hostname Phone:
    - IP_Phone_BX_FY_Z (X - building number) (Y - floor number) (Z - identifier number)

## VLANs

- List:
	- Building 1:
		- 370 - 375
	- Building 2:
		- 376 - 380
	- Building 3:
		- 381 - 385
	- Building 4:
		- 386 - 390


- Names:
	- V\_Backbone_BX;
	- V\_DMZ_BX;
	- V\_Floor0_BX;
	- V\_Floor1_BX;
	- V\_WiFi_BX;
	- V\_VoIP_BX;

## VTP Domain

- Name: rcompdng2

## IPv4 Networks
### Backbone Network
| Network Address  | Network Mask    | Equipment Name                | IP Address    | VLAN    |
|------------------|-----------------|-------------------------------|---------------|---------|
| 120.57.201.244/30| 255.255.255.252 | ISP   | 120.57.201.245   | |
|  |  | routerISP | 120.57.201.246 | 370 |

| Network Address  | Network Mask    | Equipment Name                | IP Address    |
|------------------|-----------------|-------------------------------|---------------|
| 10.127.88.0/25   | 255.255.255.128 | routerBuilding1   | 10.127.88.1   |
|  |  | routerBuilding2 | 10.127.88.2 |
|  | | routerBuilding3    | 10.127.88.3  |
|  | | routerBuilding4  | 10.127.88.4 |
|  | | routerISP | 10.127.88.5 |

### Building 1

| Network Address  | Network Mask    | Range                         | Broadcast     | VLAN ID | VLAN Name  |
|------------------|-----------------|-------------------------------|---------------|---------|------------|
| 10.127.80.0/25   | 255.255.255.128 | 10.127.80.1 - 10.127.80.126   | 10.127.80.127 | 371     | V_DMZ |
| 10.127.80.128/26 | 255.255.255.192 | 10.127.80.129 - 10.127.80.190 | 10.127.80.191 | 372     | V_Floor0      |
| 10.127.80.192/26   | 255.255.255.192 | 10.127.80.193 - 10.127.80.254    | 10.127.80.255  | 373     | V_Floor1   |
| 10.127.81.0/27  | 255.255.255.224 | 10.127.81.1 - 10.127.81.30  | 10.127.81.31 | 374     | V_WiFi   |
| 10.127.81.32/27 | 255.255.255.224 | 10.127.81.33 - 10.127.81.62 | 10.127.81.63 | 375     | V_voIP     |

### Building 2

| Network Address  | Network Mask    | Range                         | Broadcast     | VLAN ID | VLAN Name |
|------------------|-----------------|-------------------------------|---------------|---------|-----------|
| 10.127.82.0/25   | 255.255.255.128 | 10.127.82.1 - 10.127.82.126   | 10.127.82.127 | 376     | V_WiFi    |
| 10.127.82.128/25 | 255.255.255.128 | 10.127.82.129 - 10.127.82.254 | 10.127.82.255 | 377     | V_Floor1  |
| 10.127.83.0/26   | 255.255.255.192 | 10.127.83.1 - 10.127.83.62    | 10.127.83.63  | 378     | V_Floor0  |
| 10.127.83.64/26  | 255.255.255.192 | 10.127.83.65 - 10.127.83.126  | 10.127.83.127 | 379     | V_VoIP    |
| 10.127.83.128/28 | 255.255.255.240 | 10.127.83.129 - 10.127.83.142 | 10.127.83.143 | 380     | V_DMZ     |


### Building 3

| Network Address  | Network Mask    | Range                         | Broadcast     | VLAN ID | VLAN Name |
|------------------|-----------------|-------------------------------|---------------|---------|-----------|
| 10.127.84.0/24   | 255.255.255.0   | 10.127.84.1 - 10.127.84.254   | 10.127.84.255 | 381     | V_DMZ    |
| 10.127.85.0/26   | 255.255.255.192 | 10.127.85.1 - 10.127.85.62    | 10.127.85.63  | 382     | V_WiFi  |
| 10.127.85.64/26  | 255.255.255.192 | 10.127.85.65 - 10.127.85.126  | 10.127.85.127 | 383     | V_Floor1  |
| 10.127.85.128/26 | 255.255.255.192 | 10.127.85.129 - 10.127.85.190 | 10.127.85.191 | 384     | V_Floor0    |
| 10.127.85.192/26 | 255.255.255.192 | 10.127.85.193 - 10.127.85.254 | 10.127.85.255 | 385     | V_VoIP     |


### Building 4

| Network Address  | Network Mask    | Range                         | Broadcast     | VLAN ID | VLAN Name |
|------------------|-----------------|-------------------------------|---------------|---------|-----------|
| 10.127.86.0/24   | 255.255.255.0   | 10.127.86.1 - 10.127.86.254   | 10.127.86.255 | 386     | V_DMZ    |
| 10.127.87.0/26   | 255.255.255.192 | 10.127.87.1 - 10.127.87.62    | 10.127.87.63  | 387     | V_WiFi  |
| 10.127.87.64/26  | 255.255.255.192 | 10.127.87.65 - 10.127.87.126  | 10.127.87.127 | 388     | V_Floor1  |
| 10.127.87.128/26 | 255.255.255.192 | 10.127.87.129 - 10.127.87.190 | 10.127.87.191 | 389     | V_Floor0    |
| 10.127.87.192/27 | 255.255.255.224 | 10.127.87.193 - 10.127.87.222 | 10.127.87.223 | 390     | V_VoIP     |