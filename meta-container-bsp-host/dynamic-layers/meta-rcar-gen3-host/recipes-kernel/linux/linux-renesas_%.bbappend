FILESEXTRAPATHS_prepend := "${THISDIR}/linux:"

SRC_URI_append = " \
        file://0001-drm-enable-dumb-buffer-ops-for-render-nodes.patch \
        file://0002-drm-rcar-du-support-render-node.patch \
        file://lxc.cfg \
       "

KERNEL_CONFIG_FRAGMENTS_append = " \
             ${WORKDIR}/lxc.cfg \
"
