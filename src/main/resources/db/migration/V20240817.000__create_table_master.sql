DROP TABLE IF EXISTS pengajuan.m_customer CASCADE;

CREATE TABLE pengajuan.m_customer (
    id_cust serial4,
    cust_name varchar(255) NOT NULL,
    nik varchar(30) NOT NULL,
    birth_date date NOT NULL,
    marital_status varchar(20) NOT NULL,
    ktp_filename varchar(100),
    kk_filename varchar(100),
    created_at timestamp,
    updated_at timestamp,
    deleted_at timestamp,
    CONSTRAINT customer_pkey PRIMARY KEY (id_cust)
);

DROP TABLE IF EXISTS pengajuan.m_kendaraan CASCADE;
CREATE TABLE pengajuan.m_kendaraan (
    id_kendaraan serial4,
    dealer varchar(255) NOT NULL,
    merk varchar(255) NOT NULL,
    model varchar(255) NOT NULL,
    type varchar(255),
    warna varchar(255) NOT NULL,
    harga float4 NOT NULL,
    created_at timestamp,
    updated_at timestamp,
    deleted_at timestamp,
    CONSTRAINT kendaraan_pkey PRIMARY KEY (id_kendaraan)
);

DROP TABLE IF EXISTS pengajuan.m_pinjaman CASCADE;
CREATE TABLE pengajuan.m_pinjaman (
    id_pinjaman serial4,
    asuransi varchar(255) NOT NULL,
    down_payment float4 NOT NULL,
    lama_kredit int2,
    angsuran float4,
    id_kendaraan int4,
    created_at timestamp,
    updated_at timestamp,
    deleted_at timestamp,
    CONSTRAINT pinjaman_pkey PRIMARY KEY (id_pinjaman),
    CONSTRAINT pinjaman_fkey_idkendaraan FOREIGN KEY (id_kendaraan) REFERENCES m_kendaraan(id_kendaraan) ON DELETE CASCADE ON UPDATE CASCADE
)