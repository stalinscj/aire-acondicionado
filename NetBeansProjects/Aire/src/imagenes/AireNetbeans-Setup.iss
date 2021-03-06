; Script generated by the Inno Setup Script Wizard.
; SEE THE DOCUMENTATION FOR DETAILS ON CREATING INNO SETUP SCRIPT FILES!

[Setup]
; NOTE: The value of AppId uniquely identifies this application.
; Do not use the same AppId value in installers for other applications.
; (To generate a new GUID, click Tools | Generate GUID inside the IDE.)
AppId={{06A3C060-224C-42E2-9637-F374ACFB10EB}
AppName=Aire
AppVersion=1.0
;AppVerName=Aire 1.0
AppPublisher=ED2014_EQ9 - (Gomez-Guzman-Mejias-Sanchez)
AppPublisherURL=https://www.youtube.com/channel/UCbz4RaIW215k6I_BqKMyoFQ
AppSupportURL=https://www.youtube.com/channel/UCbz4RaIW215k6I_BqKMyoFQ
AppUpdatesURL=https://www.youtube.com/channel/UCbz4RaIW215k6I_BqKMyoFQ
DefaultDirName={pf}\Aire
DefaultGroupName=Aire
AllowNoIcons=yes
OutputDir=C:\Users\Usuario\Desktop
OutputBaseFilename=AireNetBeans-Setup
SetupIconFile=C:\Users\Usuario\Documents\NetBeansProjects\Aire\src\imagenes\aireIcono.ico
Compression=lzma
SolidCompression=yes

[Languages]
Name: "spanish"; MessagesFile: "compiler:Languages\Spanish.isl"

[Tasks]
Name: "desktopicon"; Description: "{cm:CreateDesktopIcon}"; GroupDescription: "{cm:AdditionalIcons}"; Flags: unchecked
Name: "quicklaunchicon"; Description: "{cm:CreateQuickLaunchIcon}"; GroupDescription: "{cm:AdditionalIcons}"; Flags: unchecked; OnlyBelowVersion: 0,6.1

[Files]
Source: "C:\Users\Usuario\Documents\NetBeansProjects\Aire\Aire.exe"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\Usuario\Documents\NetBeansProjects\Aire\*"; DestDir: "{app}"; Flags: ignoreversion recursesubdirs createallsubdirs
; NOTE: Don't use "Flags: ignoreversion" on any shared system files

[Icons]
Name: "{group}\Aire"; Filename: "{app}\Aire.exe"
Name: "{commondesktop}\Aire"; Filename: "{app}\Aire.exe"; Tasks: desktopicon
Name: "{userappdata}\Microsoft\Internet Explorer\Quick Launch\Aire"; Filename: "{app}\Aire.exe"; Tasks: quicklaunchicon

[Run]
Filename: "{app}\Aire.exe"; Description: "{cm:LaunchProgram,Aire}"; Flags: nowait postinstall skipifsilent

