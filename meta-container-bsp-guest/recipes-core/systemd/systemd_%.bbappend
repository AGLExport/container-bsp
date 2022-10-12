FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://0001-Remove-DeviceAllow-setting-from-systemd-journald.ser.patch \
    file://0002-Remove-DeviceAllow-setting-and-modprobe-from-systemd.patch \
    file://0003-Remove-DeviceAllow-setting-from-systemd-networkd.ser.patch \
    "

RRECOMMENDS_${PN}_remove = " \
                      kernel-module-autofs4 kernel-module-unix kernel-module-ipv6 kernel-module-sch-fq-codel \
"
