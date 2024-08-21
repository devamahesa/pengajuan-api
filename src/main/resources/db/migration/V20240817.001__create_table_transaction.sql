DROP TABLE IF EXISTS pengajuan.trx_pengajuan CASCADE;
CREATE TABLE pengajuan.trx_pengajuan (
    id_pengajuan serial4,
    no_pengajuan varchar(30) NOT NULL ,
    bukti_bayar_filename varchar(100),
    form_pengajuan_filename varchar(100),
    id_customer int4 NOT NULL,
    id_kendaraan int4 NOT NULL,
    id_pinjaman int4 NOT NULL,
    status varchar(20) NOT NULL,
    created_at timestamp,
    updated_at timestamp,
    deleted_at timestamp,
    CONSTRAINT pengajuan_pkey PRIMARY KEY (id_pengajuan),
    CONSTRAINT no_pengajuan_unique UNIQUE (no_pengajuan),
    CONSTRAINT pengajuan_fkey_idcustomer FOREIGN KEY (id_customer) REFERENCES m_customer(id_cust) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT pengajuan_fkey_idkendaraan FOREIGN KEY (id_kendaraan) REFERENCES m_kendaraan(id_kendaraan) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT pengajuan_fkey_idpinjaman FOREIGN KEY (id_pinjaman) REFERENCES m_pinjaman(id_pinjaman) ON DELETE CASCADE ON UPDATE CASCADE
);

DROP TABLE IF EXISTS pengajuan.trx_kontrak CASCADE;
CREATE TABLE pengajuan.trx_kontrak(
    id_kontrak serial4,
    no_kontrak_po varchar(30) NOT NULL ,
    po_filename varchar(100),
    kontrak_filename varchar(100),
    id_pengajuan int4 NOT NULL ,
    is_signed bool NOT NULL,
    created_at timestamp,
    updated_at timestamp,
    deleted_at timestamp,
    CONSTRAINT kontrak_pkey PRIMARY KEY (id_kontrak),
    CONSTRAINT no_kontrak_po_unique UNIQUE (no_kontrak_po),
    CONSTRAINT kontrak_fkey_pengajuan FOREIGN KEY (id_pengajuan) REFERENCES trx_pengajuan(id_pengajuan) ON DELETE CASCADE ON UPDATE CASCADE
)